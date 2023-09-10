package com.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.StarCircle: ImageVector
    get() {
        if (_starCircle != null) {
            return _starCircle!!
        }
        _starCircle = Builder(
            name = "StarCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.4127f, 8.4981f)
                lineTo(10.5766f, 8.2042f)
                curveTo(11.2099f, 7.0681f, 11.5266f, 6.5f, 12.0f, 6.5f)
                curveTo(12.4734f, 6.5f, 12.7901f, 7.0681f, 13.4234f, 8.2042f)
                lineTo(13.5873f, 8.4981f)
                curveTo(13.7672f, 8.821f, 13.8572f, 8.9824f, 13.9975f, 9.0889f)
                curveTo(14.1378f, 9.1954f, 14.3126f, 9.235f, 14.6621f, 9.314f)
                lineTo(14.9802f, 9.386f)
                curveTo(16.2101f, 9.6643f, 16.825f, 9.8034f, 16.9713f, 10.2739f)
                curveTo(17.1176f, 10.7443f, 16.6984f, 11.2345f, 15.86f, 12.215f)
                lineTo(15.643f, 12.4686f)
                curveTo(15.4048f, 12.7472f, 15.2857f, 12.8865f, 15.2321f, 13.0589f)
                curveTo(15.1785f, 13.2312f, 15.1965f, 13.4171f, 15.2325f, 13.7888f)
                lineTo(15.2653f, 14.1272f)
                curveTo(15.3921f, 15.4353f, 15.4554f, 16.0894f, 15.0724f, 16.3801f)
                curveTo(14.6894f, 16.6709f, 14.1137f, 16.4058f, 12.9622f, 15.8756f)
                lineTo(12.6643f, 15.7384f)
                curveTo(12.337f, 15.5878f, 12.1734f, 15.5124f, 12.0f, 15.5124f)
                curveTo(11.8266f, 15.5124f, 11.663f, 15.5878f, 11.3357f, 15.7384f)
                lineTo(11.0378f, 15.8756f)
                curveTo(9.8863f, 16.4058f, 9.3106f, 16.6709f, 8.9276f, 16.3801f)
                curveTo(8.5446f, 16.0894f, 8.6079f, 15.4353f, 8.7347f, 14.1272f)
                lineTo(8.7675f, 13.7888f)
                curveTo(8.8035f, 13.4171f, 8.8215f, 13.2312f, 8.7679f, 13.0589f)
                curveTo(8.7143f, 12.8865f, 8.5952f, 12.7472f, 8.357f, 12.4686f)
                lineTo(8.14f, 12.215f)
                curveTo(7.3016f, 11.2345f, 6.8824f, 10.7443f, 7.0287f, 10.2739f)
                curveTo(7.175f, 9.8034f, 7.7899f, 9.6643f, 9.0198f, 9.386f)
                lineTo(9.3379f, 9.314f)
                curveTo(9.6874f, 9.235f, 9.8622f, 9.1954f, 10.0025f, 9.0889f)
                curveTo(10.1428f, 8.9824f, 10.2328f, 8.821f, 10.4127f, 8.4981f)
                close()
            }
        }
            .build()
        return _starCircle!!
    }

private var _starCircle: ImageVector? = null
