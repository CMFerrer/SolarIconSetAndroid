package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.PinCircle: ImageVector
    get() {
        if (_pinCircle != null) {
            return _pinCircle!!
        }
        _pinCircle = Builder(
            name = "PinCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(21.9998f, 12.0f)
                curveTo(21.9998f, 17.5228f, 17.5226f, 22.0f, 11.9998f, 22.0f)
                curveTo(6.4769f, 22.0f, 1.9998f, 17.5228f, 1.9998f, 12.0f)
                curveTo(1.9998f, 6.4771f, 6.4769f, 2.0f, 11.9998f, 2.0f)
                curveTo(17.5226f, 2.0f, 21.9998f, 6.4771f, 21.9998f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5918f, 9.9026f)
                lineTo(14.1094f, 8.4188f)
                curveTo(13.0961f, 7.4044f, 12.5894f, 6.8973f, 12.0452f, 7.0173f)
                curveTo(11.501f, 7.1374f, 11.2543f, 7.8108f, 10.7608f, 9.1575f)
                lineTo(10.4269f, 10.069f)
                curveTo(10.2953f, 10.4281f, 10.2295f, 10.6076f, 10.1112f, 10.7465f)
                curveTo(10.0581f, 10.8088f, 9.9977f, 10.8644f, 9.9312f, 10.9123f)
                curveTo(9.7832f, 11.0188f, 9.5991f, 11.0696f, 9.2307f, 11.1711f)
                curveTo(8.4005f, 11.4f, 7.9854f, 11.5145f, 7.829f, 11.786f)
                curveTo(7.7614f, 11.9035f, 7.7262f, 12.0368f, 7.7271f, 12.1723f)
                curveTo(7.7291f, 12.4858f, 8.0335f, 12.7905f, 8.6424f, 13.4f)
                lineTo(9.0887f, 13.848f)
                lineTo(7.4692f, 15.4701f)
                curveTo(7.1766f, 15.7632f, 7.177f, 16.2381f, 7.4701f, 16.5308f)
                curveTo(7.7632f, 16.8234f, 8.2381f, 16.823f, 8.5308f, 16.5299f)
                lineTo(10.1495f, 14.9086f)
                lineTo(10.6222f, 15.3818f)
                curveTo(11.235f, 15.9951f, 11.5413f, 16.3018f, 11.8567f, 16.3023f)
                curveTo(11.9896f, 16.3025f, 12.1202f, 16.2679f, 12.2357f, 16.202f)
                curveTo(12.5096f, 16.0457f, 12.6247f, 15.6276f, 12.8548f, 14.7913f)
                curveTo(12.9559f, 14.4236f, 13.0065f, 14.2397f, 13.1127f, 14.0918f)
                curveTo(13.1592f, 14.027f, 13.2131f, 13.9679f, 13.2734f, 13.9157f)
                curveTo(13.411f, 13.7965f, 13.5894f, 13.7295f, 13.9461f, 13.5955f)
                lineTo(14.8681f, 13.2491f)
                curveTo(16.2f, 12.7487f, 16.866f, 12.4985f, 16.9833f, 11.9557f)
                curveTo(17.1007f, 11.413f, 16.5977f, 10.9095f, 15.5918f, 9.9026f)
                close()
            }
        }
            .build()
        return _pinCircle!!
    }

private var _pinCircle: ImageVector? = null
