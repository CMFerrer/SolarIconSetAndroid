package com.chiksmedina.solar.linear.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.TextFormattingGroup

val TextFormattingGroup.EraserSquare: ImageVector
    get() {
        if (_eraserSquare != null) {
            return _eraserSquare!!
        }
        _eraserSquare = Builder(
            name = "EraserSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.67f, 11.6064f)
                lineTo(8.2004f, 12.1367f)
                lineTo(8.2004f, 12.1367f)
                lineTo(7.67f, 11.6064f)
                close()
                moveTo(6.0f, 13.9682f)
                lineTo(5.25f, 13.9682f)
                lineTo(6.0f, 13.9682f)
                close()
                moveTo(10.0318f, 18.0f)
                verticalLineTo(18.75f)
                verticalLineTo(18.0f)
                close()
                moveTo(11.6064f, 7.67f)
                lineTo(11.076f, 7.1397f)
                lineTo(11.076f, 7.1397f)
                lineTo(11.6064f, 7.67f)
                close()
                moveTo(12.6506f, 16.073f)
                curveTo(12.9435f, 16.3659f, 13.4183f, 16.3659f, 13.7112f, 16.073f)
                curveTo(14.0041f, 15.7801f, 14.0041f, 15.3053f, 13.7112f, 15.0124f)
                lineTo(12.6506f, 16.073f)
                close()
                moveTo(8.9876f, 10.2888f)
                curveTo(8.6947f, 9.9959f, 8.2199f, 9.9959f, 7.927f, 10.2888f)
                curveTo(7.6341f, 10.5817f, 7.6341f, 11.0565f, 7.927f, 11.3494f)
                lineTo(8.9876f, 10.2888f)
                close()
                moveTo(15.7996f, 11.8633f)
                lineTo(11.8633f, 15.7996f)
                lineTo(12.924f, 16.8603f)
                lineTo(16.8603f, 12.924f)
                lineTo(15.7996f, 11.8633f)
                close()
                moveTo(8.2004f, 12.1367f)
                lineTo(12.1367f, 8.2004f)
                lineTo(11.076f, 7.1397f)
                lineTo(7.1397f, 11.076f)
                lineTo(8.2004f, 12.1367f)
                close()
                moveTo(8.2004f, 15.7996f)
                curveTo(7.6287f, 15.228f, 7.2544f, 14.8514f, 7.0138f, 14.536f)
                curveTo(6.7863f, 14.2379f, 6.75f, 14.0841f, 6.75f, 13.9682f)
                lineTo(5.25f, 13.9682f)
                curveTo(5.25f, 14.544f, 5.492f, 15.0144f, 5.8212f, 15.4459f)
                curveTo(6.1373f, 15.8601f, 6.598f, 16.3186f, 7.1397f, 16.8603f)
                lineTo(8.2004f, 15.7996f)
                close()
                moveTo(7.1397f, 11.076f)
                curveTo(6.598f, 11.6177f, 6.1373f, 12.0762f, 5.8212f, 12.4904f)
                curveTo(5.492f, 12.922f, 5.25f, 13.3924f, 5.25f, 13.9682f)
                horizontalLineTo(6.75f)
                curveTo(6.75f, 13.8522f, 6.7863f, 13.6984f, 7.0138f, 13.4003f)
                curveTo(7.2544f, 13.0849f, 7.6287f, 12.7084f, 8.2004f, 12.1367f)
                lineTo(7.1397f, 11.076f)
                close()
                moveTo(11.8633f, 15.7996f)
                curveTo(11.2916f, 16.3713f, 10.9151f, 16.7456f, 10.5997f, 16.9862f)
                curveTo(10.3016f, 17.2137f, 10.1478f, 17.25f, 10.0318f, 17.25f)
                verticalLineTo(18.75f)
                curveTo(10.6076f, 18.75f, 11.078f, 18.508f, 11.5096f, 18.1788f)
                curveTo(11.9238f, 17.8627f, 12.3823f, 17.402f, 12.924f, 16.8603f)
                lineTo(11.8633f, 15.7996f)
                close()
                moveTo(7.1397f, 16.8603f)
                curveTo(7.6814f, 17.402f, 8.1399f, 17.8627f, 8.5541f, 18.1788f)
                curveTo(8.9856f, 18.508f, 9.456f, 18.75f, 10.0318f, 18.75f)
                verticalLineTo(17.25f)
                curveTo(9.9159f, 17.25f, 9.7621f, 17.2137f, 9.464f, 16.9862f)
                curveTo(9.1486f, 16.7456f, 8.772f, 16.3713f, 8.2004f, 15.7996f)
                lineTo(7.1397f, 16.8603f)
                close()
                moveTo(15.7996f, 8.2004f)
                curveTo(16.3713f, 8.772f, 16.7456f, 9.1486f, 16.9862f, 9.464f)
                curveTo(17.2137f, 9.7621f, 17.25f, 9.9159f, 17.25f, 10.0318f)
                horizontalLineTo(18.75f)
                curveTo(18.75f, 9.456f, 18.508f, 8.9856f, 18.1788f, 8.5541f)
                curveTo(17.8627f, 8.1399f, 17.402f, 7.6814f, 16.8603f, 7.1397f)
                lineTo(15.7996f, 8.2004f)
                close()
                moveTo(16.8603f, 12.924f)
                curveTo(17.402f, 12.3823f, 17.8627f, 11.9238f, 18.1788f, 11.5096f)
                curveTo(18.508f, 11.078f, 18.75f, 10.6076f, 18.75f, 10.0318f)
                horizontalLineTo(17.25f)
                curveTo(17.25f, 10.1478f, 17.2137f, 10.3016f, 16.9862f, 10.5997f)
                curveTo(16.7456f, 10.9151f, 16.3713f, 11.2916f, 15.7996f, 11.8633f)
                lineTo(16.8603f, 12.924f)
                close()
                moveTo(16.8603f, 7.1397f)
                curveTo(16.3186f, 6.598f, 15.8601f, 6.1373f, 15.4459f, 5.8212f)
                curveTo(15.0144f, 5.492f, 14.544f, 5.25f, 13.9682f, 5.25f)
                verticalLineTo(6.75f)
                curveTo(14.0841f, 6.75f, 14.2379f, 6.7863f, 14.536f, 7.0138f)
                curveTo(14.8514f, 7.2544f, 15.228f, 7.6287f, 15.7996f, 8.2004f)
                lineTo(16.8603f, 7.1397f)
                close()
                moveTo(12.1367f, 8.2004f)
                curveTo(12.7084f, 7.6287f, 13.0849f, 7.2544f, 13.4003f, 7.0138f)
                curveTo(13.6984f, 6.7863f, 13.8522f, 6.75f, 13.9682f, 6.75f)
                verticalLineTo(5.25f)
                curveTo(13.3924f, 5.25f, 12.922f, 5.492f, 12.4904f, 5.8212f)
                curveTo(12.0762f, 6.1373f, 11.6177f, 6.598f, 11.076f, 7.1397f)
                lineTo(12.1367f, 8.2004f)
                close()
                moveTo(13.7112f, 15.0124f)
                lineTo(8.9876f, 10.2888f)
                lineTo(7.927f, 11.3494f)
                lineTo(12.6506f, 16.073f)
                lineTo(13.7112f, 15.0124f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
        }
            .build()
        return _eraserSquare!!
    }

private var _eraserSquare: ImageVector? = null
