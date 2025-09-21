package dev.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.Pulse2: ImageVector
    get() {
        if (_pulse2 != null) {
            return _pulse2!!
        }
        _pulse2 = Builder(
            name = "Pulse2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 13.081f, 1.25f, 14.0065f, 1.2665f, 14.8426f)
                curveTo(1.2557f, 14.8934f, 1.25f, 14.946f, 1.25f, 15.0f)
                curveTo(1.25f, 15.066f, 1.2585f, 15.1301f, 1.2746f, 15.1911f)
                curveTo(1.2986f, 16.0947f, 1.346f, 16.889f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.654f, 16.889f, 22.7014f, 16.0947f, 22.7254f, 15.1911f)
                curveTo(22.7415f, 15.1301f, 22.75f, 15.066f, 22.75f, 15.0f)
                curveTo(22.75f, 14.946f, 22.7443f, 14.8934f, 22.7335f, 14.8427f)
                curveTo(22.75f, 14.0065f, 22.75f, 13.081f, 22.75f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(22.75f, 9.6342f, 22.75f, 7.8252f, 22.5603f, 6.4137f)
                curveTo(22.366f, 4.969f, 21.9607f, 3.8289f, 21.0659f, 2.9341f)
                curveTo(20.1711f, 2.0393f, 19.031f, 1.634f, 17.5863f, 1.4397f)
                curveTo(16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f, 1.25f)
                horizontalLineTo(11.9426f)
                close()
                moveTo(21.2422f, 14.25f)
                curveTo(21.2498f, 13.5738f, 21.25f, 12.8274f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 12.8274f, 2.7502f, 13.5738f, 2.7578f, 14.25f)
                horizontalLineTo(5.0f)
                lineTo(5.1077f, 14.2499f)
                curveTo(5.6338f, 14.2491f, 6.1007f, 14.2483f, 6.5292f, 14.4319f)
                curveTo(6.9576f, 14.6155f, 7.2791f, 14.9542f, 7.6413f, 15.3357f)
                lineTo(7.7155f, 15.4138f)
                lineTo(8.8571f, 16.6125f)
                curveTo(8.9387f, 16.6981f, 9.0054f, 16.7681f, 9.0642f, 16.8277f)
                curveTo(9.1145f, 16.7607f, 9.1713f, 16.6825f, 9.2406f, 16.5867f)
                lineTo(12.8944f, 11.5435f)
                curveTo(13.0432f, 11.3379f, 13.1985f, 11.1233f, 13.3518f, 10.9653f)
                curveTo(13.5272f, 10.7844f, 13.7992f, 10.5708f, 14.1937f, 10.5527f)
                curveTo(14.5882f, 10.5346f, 14.8787f, 10.7223f, 15.0699f, 10.8863f)
                curveTo(15.2371f, 11.0297f, 15.4114f, 11.229f, 15.5785f, 11.4201f)
                lineTo(17.3823f, 13.4816f)
                curveTo(17.868f, 14.0368f, 17.9718f, 14.1316f, 18.085f, 14.183f)
                curveTo(18.1982f, 14.2343f, 18.3379f, 14.25f, 19.0756f, 14.25f)
                horizontalLineTo(21.2422f)
                close()
                moveTo(2.7943f, 15.75f)
                curveTo(2.8202f, 16.3612f, 2.8613f, 16.9021f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.1387f, 16.9021f, 21.1798f, 16.3612f, 21.2057f, 15.75f)
                horizontalLineTo(19.0756f)
                lineTo(18.9615f, 15.7501f)
                curveTo(18.4059f, 15.751f, 17.9125f, 15.7519f, 17.4652f, 15.5489f)
                curveTo(17.0179f, 15.346f, 16.6936f, 14.9741f, 16.3285f, 14.5553f)
                lineTo(16.2534f, 14.4694f)
                lineTo(14.4761f, 12.4382f)
                curveTo(14.395f, 12.3454f, 14.3284f, 12.2694f, 14.2697f, 12.2046f)
                curveTo(14.2171f, 12.2746f, 14.1578f, 12.3563f, 14.0855f, 12.4561f)
                lineTo(10.4324f, 17.4984f)
                curveTo(10.2894f, 17.696f, 10.1391f, 17.9035f, 9.9903f, 18.0574f)
                curveTo(9.8191f, 18.2345f, 9.5562f, 18.4416f, 9.1742f, 18.4672f)
                curveTo(8.7923f, 18.4929f, 8.504f, 18.3227f, 8.3107f, 18.1701f)
                curveTo(8.1426f, 18.0375f, 7.966f, 17.8519f, 7.7979f, 17.6753f)
                lineTo(6.6293f, 16.4483f)
                curveTo(6.1484f, 15.9433f, 6.0468f, 15.8572f, 5.9383f, 15.8106f)
                curveTo(5.8298f, 15.7641f, 5.6974f, 15.75f, 5.0f, 15.75f)
                horizontalLineTo(2.7943f)
                close()
            }
        }
            .build()
        return _pulse2!!
    }

private var _pulse2: ImageVector? = null
