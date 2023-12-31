package com.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(
            name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.2633f, 8.2624f)
                lineTo(11.0f, 12.0f)
                verticalLineTo(5.2246f)
                curveTo(11.0f, 3.3382f, 11.0f, 2.395f, 11.6047f, 2.0856f)
                curveTo(12.2093f, 1.7763f, 12.9813f, 2.3245f, 14.5253f, 3.4209f)
                lineTo(16.2633f, 4.6551f)
                curveTo(17.4211f, 5.4773f, 18.0f, 5.8884f, 18.0f, 6.4587f)
                curveTo(18.0f, 7.0291f, 17.4211f, 7.4402f, 16.2633f, 8.2624f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.2633f, 19.3449f)
                lineTo(14.5253f, 20.5791f)
                curveTo(12.9813f, 21.6755f, 12.2093f, 22.2238f, 11.6047f, 21.9144f)
                curveTo(11.0f, 21.605f, 11.0f, 20.6618f, 11.0f, 18.7754f)
                verticalLineTo(12.0f)
                lineTo(16.2633f, 15.7376f)
                curveTo(17.4211f, 16.5598f, 18.0f, 16.9709f, 18.0f, 17.5413f)
                curveTo(18.0f, 18.1116f, 17.4211f, 18.5227f, 16.2633f, 19.3449f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 15.5f)
                lineTo(11.0f, 12.0f)
                lineTo(6.0f, 8.5f)
            }
        }
            .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
