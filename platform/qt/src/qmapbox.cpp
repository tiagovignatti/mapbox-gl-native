#include <mbgl/storage/network_status.hpp>
#include <mbgl/util/default_styles.hpp>

#include <QMapbox>

namespace QMapbox {

Q_DECL_EXPORT NetworkMode networkMode()
{
    switch (mbgl::NetworkStatus::Get()) {
    case mbgl::NetworkStatus::Status::Online:
        return NetworkMode::Online;
    case mbgl::NetworkStatus::Status::Offline:
        return NetworkMode::Offline;
    }

    // Silence compile warnings, should never happen.
    return NetworkMode::Online;
}

Q_DECL_EXPORT void setNetworkMode(NetworkMode mode)
{
    switch (mode) {
    case Online:
        mbgl::NetworkStatus::Set(mbgl::NetworkStatus::Status::Online);
        break;
    case Offline:
        mbgl::NetworkStatus::Set(mbgl::NetworkStatus::Status::Offline);
        break;
    }
}

Q_DECL_EXPORT QList<QPair<QString, QString>>& defaultStyles()
{
    static QList<QPair<QString, QString>> styles;

    if (styles.isEmpty()) {
        for (auto style : mbgl::util::default_styles::orderedStyles) {
            styles.append(QPair<QString, QString>(
                QString::fromStdString(style.url), QString::fromStdString(style.name)));
        }
    }

    return styles;
}

}