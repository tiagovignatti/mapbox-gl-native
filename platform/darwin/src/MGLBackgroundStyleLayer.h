// This file is generated. 
// Edit platform/ios/scripts/generate-style-code.js, then run `make style-code-ios`.

#import <Mapbox/Mapbox.h>

#import "MGLTypes.h"


@interface MGLBackgroundStyleLayer : MGLStyleLayer

#pragma mark - Accessing the Paint Attributes

/**
  The color with which the background will be drawn.
*/
@property (nonatomic) MGLColor *backgroundColor;

/**
  Name of image in sprite to use for drawing an image background. For seamless patterns, image width and height must be a factor of two (2, 4, 8, ..., 512).
*/
@property (nonatomic) NSString *backgroundPattern;

/**
  The opacity at which the background will be drawn.
*/
@property (nonatomic) CGFloat backgroundOpacity;

@end
