package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.SimCards: ImageVector
    get() {
        if (_simCards != null) {
            return _simCards!!
        }
        _simCards = Builder(
            name = "SimCards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.8283f, 16.8284f)
                curveTo(21.9999f, 15.6569f, 21.9999f, 13.7712f, 21.9999f, 10.0f)
                curveTo(21.9999f, 8.9746f, 21.5894f, 7.9937f, 20.8644f, 7.2686f)
                lineTo(16.7313f, 3.1356f)
                curveTo(16.0062f, 2.4105f, 15.0253f, 2.0f, 13.9999f, 2.0f)
                curveTo(10.2287f, 2.0f, 8.3431f, 2.0f, 7.1715f, 3.1716f)
                curveTo(6.7937f, 3.5494f, 6.5377f, 4.0015f, 6.3643f, 4.5671f)
                curveTo(7.371f, 4.4999f, 8.5497f, 4.4999f, 9.8959f, 4.5f)
                lineTo(9.9999f, 4.5f)
                curveTo(11.4272f, 4.5f, 12.7885f, 5.0715f, 13.7919f, 6.0749f)
                lineTo(17.925f, 10.208f)
                curveTo(18.9284f, 11.2114f, 19.4998f, 12.5726f, 19.4998f, 14.0f)
                lineTo(19.4999f, 14.104f)
                curveTo(19.4999f, 15.4502f, 19.4999f, 16.6289f, 19.4327f, 17.6357f)
                curveTo(19.9984f, 17.4623f, 20.4505f, 17.2063f, 20.8283f, 16.8284f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 22.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(4.3432f, 6.0f, 6.2288f, 6.0f, 10.0f, 6.0f)
                curveTo(11.0254f, 6.0f, 12.0063f, 6.4105f, 12.7314f, 7.1356f)
                lineTo(16.8644f, 11.2686f)
                curveTo(17.5895f, 11.9937f, 18.0f, 12.9746f, 18.0f, 14.0f)
                curveTo(18.0f, 17.7712f, 18.0f, 19.6569f, 16.8284f, 20.8284f)
                curveTo(15.6569f, 22.0f, 13.7712f, 22.0f, 10.0f, 22.0f)
                close()
                moveTo(7.2929f, 18.7071f)
                curveTo(7.5858f, 19.0f, 8.0572f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                curveTo(8.0572f, 14.0f, 7.5858f, 14.0f, 7.2929f, 14.2929f)
                curveTo(7.0f, 14.5858f, 7.0f, 15.0572f, 7.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 17.9428f, 7.0f, 18.4142f, 7.2929f, 18.7071f)
                close()
                moveTo(12.7071f, 18.7071f)
                curveTo(12.4142f, 19.0f, 11.9428f, 19.0f, 11.0f, 19.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 17.9428f, 13.0f, 18.4142f, 12.7071f, 18.7071f)
                close()
                moveTo(11.0f, 14.0f)
                curveTo(11.9428f, 14.0f, 12.4142f, 14.0f, 12.7071f, 14.2929f)
                curveTo(13.0f, 14.5858f, 13.0f, 15.0572f, 13.0f, 16.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
            .build()
        return _simCards!!
    }

private var _simCards: ImageVector? = null
