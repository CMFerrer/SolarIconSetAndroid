package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.PlugCircle: ImageVector
    get() {
        if (_plugCircle != null) {
            return _plugCircle!!
        }
        _plugCircle = Builder(
            name = "PlugCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8972f, 2.75f, 2.75f, 6.9227f, 2.75f, 12.0832f)
                curveTo(2.75f, 16.6065f, 5.9381f, 20.3736f, 10.1622f, 21.2324f)
                curveTo(10.6697f, 21.3355f, 11.25f, 20.909f, 11.25f, 20.1498f)
                verticalLineTo(15.675f)
                curveTo(9.5383f, 15.3275f, 8.25f, 13.8142f, 8.25f, 12.0f)
                verticalLineTo(11.8f)
                curveTo(8.25f, 10.9607f, 8.9171f, 10.2772f, 9.75f, 10.2508f)
                verticalLineTo(9.0f)
                curveTo(9.75f, 8.5858f, 10.0858f, 8.25f, 10.5f, 8.25f)
                curveTo(10.9142f, 8.25f, 11.25f, 8.5858f, 11.25f, 9.0f)
                verticalLineTo(10.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(9.0f)
                curveTo(12.75f, 8.5858f, 13.0858f, 8.25f, 13.5f, 8.25f)
                curveTo(13.9142f, 8.25f, 14.25f, 8.5858f, 14.25f, 9.0f)
                verticalLineTo(10.2508f)
                curveTo(15.0829f, 10.2772f, 15.75f, 10.9607f, 15.75f, 11.8f)
                verticalLineTo(12.0f)
                curveTo(15.75f, 13.8142f, 14.4617f, 15.3275f, 12.75f, 15.675f)
                verticalLineTo(20.1498f)
                curveTo(12.75f, 21.618f, 11.5214f, 23.0394f, 9.8633f, 22.7023f)
                curveTo(4.9458f, 21.7025f, 1.25f, 17.3253f, 1.25f, 12.0832f)
                curveTo(1.25f, 6.1061f, 6.0571f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9429f, 1.25f, 22.75f, 6.1061f, 22.75f, 12.0832f)
                curveTo(22.75f, 16.369f, 20.2798f, 20.0752f, 16.6941f, 21.8316f)
                curveTo(16.3221f, 22.0138f, 15.8728f, 21.86f, 15.6906f, 21.488f)
                curveTo(15.5084f, 21.116f, 15.6622f, 20.6668f, 16.0342f, 20.4846f)
                curveTo(19.1208f, 18.9726f, 21.25f, 15.7797f, 21.25f, 12.0832f)
                curveTo(21.25f, 6.9227f, 17.1028f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(9.8f, 11.75f)
                curveTo(9.7724f, 11.75f, 9.75f, 11.7724f, 9.75f, 11.8f)
                verticalLineTo(12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                verticalLineTo(11.8f)
                curveTo(14.25f, 11.7724f, 14.2276f, 11.75f, 14.2f, 11.75f)
                horizontalLineTo(9.8f)
                close()
            }
        }
            .build()
        return _plugCircle!!
    }

private var _plugCircle: ImageVector? = null
