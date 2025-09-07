package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.7426f, 15.1577f)
                lineTo(12.3019f, 12.0043f)
                lineTo(12.3079f, 12.0001f)
                lineTo(12.3013f, 11.9954f)
                lineTo(16.7426f, 8.8415f)
                curveTo(17.2829f, 8.4579f, 17.7547f, 8.1228f, 18.0842f, 7.8077f)
                curveTo(18.435f, 7.4722f, 18.75f, 7.0432f, 18.75f, 6.4583f)
                curveTo(18.75f, 5.8735f, 18.435f, 5.4444f, 18.0842f, 5.109f)
                curveTo(17.7547f, 4.7938f, 17.2829f, 4.4588f, 16.7426f, 4.0752f)
                lineTo(14.9098f, 2.7737f)
                curveTo(14.1803f, 2.2556f, 13.5644f, 1.8182f, 13.0535f, 1.5576f)
                curveTo(12.5333f, 1.2922f, 11.8982f, 1.0925f, 11.263f, 1.4175f)
                curveTo(10.6261f, 1.7434f, 10.4191f, 2.3765f, 10.3337f, 2.9534f)
                curveTo(10.2499f, 3.5189f, 10.25f, 4.272f, 10.25f, 5.1627f)
                lineTo(10.25f, 10.5595f)
                lineTo(6.4302f, 7.8856f)
                curveTo(6.0908f, 7.6481f, 5.6232f, 7.7306f, 5.3856f, 8.07f)
                curveTo(5.1481f, 8.4093f, 5.2306f, 8.877f, 5.57f, 9.1145f)
                lineTo(9.6922f, 12.0001f)
                lineTo(5.57f, 14.8856f)
                curveTo(5.2306f, 15.1232f, 5.1481f, 15.5908f, 5.3856f, 15.9302f)
                curveTo(5.6232f, 16.2695f, 6.0908f, 16.352f, 6.4302f, 16.1145f)
                lineTo(10.25f, 13.4406f)
                lineTo(10.25f, 18.8365f)
                curveTo(10.25f, 19.7272f, 10.2499f, 20.4803f, 10.3337f, 21.0458f)
                curveTo(10.4191f, 21.6227f, 10.6261f, 22.2558f, 11.2631f, 22.5817f)
                curveTo(11.8982f, 22.9067f, 12.5333f, 22.707f, 13.0535f, 22.4416f)
                curveTo(13.5644f, 22.181f, 14.1803f, 21.7436f, 14.9098f, 21.2255f)
                lineTo(16.7425f, 19.924f)
                curveTo(17.2828f, 19.5404f, 17.7547f, 19.2053f, 18.0842f, 18.8902f)
                curveTo(18.435f, 18.5548f, 18.75f, 18.1257f, 18.75f, 17.5409f)
                curveTo(18.75f, 16.956f, 18.435f, 16.527f, 18.0842f, 16.1915f)
                curveTo(17.7547f, 15.8764f, 17.2829f, 15.5413f, 16.7426f, 15.1577f)
                close()
            }
        }
            .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
