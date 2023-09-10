package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

val SportsGroup.Balls: ImageVector
    get() {
        if (_balls != null) {
            return _balls!!
        }
        _balls = Builder(
            name = "Balls", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.4851f, 2.75f)
                curveTo(7.513f, 2.7515f, 6.5287f, 2.9999f, 5.6255f, 3.5213f)
                curveTo(4.786f, 4.006f, 4.115f, 4.6705f, 3.633f, 5.438f)
                curveTo(3.6701f, 5.4626f, 3.7105f, 5.49f, 3.7539f, 5.5202f)
                curveTo(3.9836f, 5.6801f, 4.2988f, 5.9205f, 4.661f, 6.2534f)
                curveTo(5.3858f, 6.9196f, 6.2991f, 7.9566f, 7.0917f, 9.4594f)
                curveTo(7.641f, 10.501f, 7.9831f, 11.4831f, 8.1954f, 12.3238f)
                curveTo(8.5796f, 11.4173f, 9.11f, 10.5622f, 9.8361f, 9.8361f)
                curveTo(10.1426f, 9.5296f, 10.4721f, 9.258f, 10.8187f, 9.0175f)
                curveTo(10.5091f, 8.5852f, 10.2005f, 8.0945f, 9.9083f, 7.5406f)
                curveTo(9.1162f, 6.0387f, 8.7551f, 4.6605f, 8.5923f, 3.6518f)
                curveTo(8.5363f, 3.3048f, 8.5037f, 3.0009f, 8.4851f, 2.75f)
                close()
                moveTo(10.0102f, 2.9529f)
                curveTo(10.0259f, 3.0929f, 10.0464f, 3.2467f, 10.0732f, 3.4128f)
                curveTo(10.2149f, 4.2907f, 10.5321f, 5.5079f, 11.2351f, 6.8408f)
                curveTo(11.5252f, 7.3908f, 11.832f, 7.8676f, 12.1354f, 8.2777f)
                curveTo(12.7968f, 7.9799f, 13.489f, 7.7632f, 14.181f, 7.6077f)
                curveTo(14.0746f, 6.929f, 13.8436f, 6.2576f, 13.4787f, 5.6255f)
                curveTo(12.6893f, 4.2582f, 11.4234f, 3.3376f, 10.0102f, 2.9529f)
                close()
                moveTo(15.6606f, 7.3606f)
                curveTo(15.5251f, 6.5082f, 15.2342f, 5.6662f, 14.7777f, 4.8755f)
                curveTo(13.5917f, 2.8213f, 11.5513f, 1.5675f, 9.3674f, 1.3028f)
                curveTo(7.8631f, 1.1204f, 6.2881f, 1.4067f, 4.8755f, 2.2222f)
                curveTo(1.4084f, 4.224f, 0.2205f, 8.6573f, 2.2223f, 12.1244f)
                curveTo(3.359f, 14.0933f, 5.2801f, 15.3266f, 7.3608f, 15.659f)
                curveTo(7.3496f, 15.7559f, 7.3395f, 15.8523f, 7.3303f, 15.9482f)
                curveTo(7.2126f, 17.1713f, 7.2397f, 18.3428f, 7.3133f, 19.3052f)
                curveTo(7.4528f, 21.1301f, 8.8699f, 22.5472f, 10.6948f, 22.6867f)
                curveTo(11.6572f, 22.7603f, 12.8286f, 22.7874f, 14.0518f, 22.6697f)
                curveTo(16.1428f, 22.4685f, 18.4943f, 21.8335f, 20.1639f, 20.1639f)
                curveTo(21.8335f, 18.4943f, 22.4686f, 16.1428f, 22.6697f, 14.0518f)
                curveTo(22.7874f, 12.8286f, 22.7603f, 11.6572f, 22.6867f, 10.6948f)
                curveTo(22.5472f, 8.8699f, 21.1301f, 7.4528f, 19.3052f, 7.3133f)
                curveTo(18.3428f, 7.2397f, 17.1714f, 7.2126f, 15.9482f, 7.3303f)
                curveTo(15.8529f, 7.3394f, 15.7569f, 7.3495f, 15.6606f, 7.3606f)
                close()
                moveTo(6.9898f, 14.0471f)
                curveTo(5.5767f, 13.6625f, 4.3107f, 12.7417f, 3.5213f, 11.3744f)
                curveTo(2.6926f, 9.939f, 2.5532f, 8.2948f, 3.0004f, 6.8251f)
                curveTo(3.171f, 6.9496f, 3.3928f, 7.1251f, 3.6459f, 7.3578f)
                curveTo(4.2615f, 7.9235f, 5.0624f, 8.8272f, 5.7649f, 10.1592f)
                curveTo(6.4679f, 11.4921f, 6.7851f, 12.7093f, 6.9268f, 13.5872f)
                curveTo(6.9536f, 13.7533f, 6.9741f, 13.9071f, 6.9898f, 14.0471f)
                close()
                moveTo(17.754f, 8.7501f)
                lineTo(21.2499f, 12.246f)
                curveTo(21.2478f, 11.7354f, 21.2249f, 11.2508f, 21.1911f, 10.8092f)
                curveTo(21.108f, 9.7225f, 20.2775f, 8.892f, 19.1908f, 8.8089f)
                curveTo(18.7492f, 8.7751f, 18.2645f, 8.7522f, 17.754f, 8.7501f)
                close()
                moveTo(21.1389f, 14.2563f)
                lineTo(15.7437f, 8.8611f)
                curveTo(13.9169f, 9.0819f, 12.1293f, 9.6643f, 10.8968f, 10.8968f)
                curveTo(9.6643f, 12.1292f, 9.0819f, 13.9169f, 8.8611f, 15.7437f)
                lineTo(14.2563f, 21.1389f)
                curveTo(16.0831f, 20.9181f, 17.8708f, 20.3357f, 19.1032f, 19.1032f)
                curveTo(20.3357f, 17.8707f, 20.9181f, 16.0831f, 21.1389f, 14.2563f)
                close()
                moveTo(12.246f, 21.2498f)
                lineTo(8.7501f, 17.754f)
                curveTo(8.7522f, 18.2645f, 8.7751f, 18.7492f, 8.8089f, 19.1908f)
                curveTo(8.892f, 20.2775f, 9.7225f, 21.108f, 10.8092f, 21.1911f)
                curveTo(11.2508f, 21.2249f, 11.7355f, 21.2478f, 12.246f, 21.2498f)
                close()
                moveTo(14.9697f, 11.9697f)
                curveTo(15.2626f, 11.6768f, 15.7374f, 11.6768f, 16.0303f, 11.9697f)
                lineTo(16.5f, 12.4393f)
                lineTo(16.9697f, 11.9697f)
                curveTo(17.2626f, 11.6768f, 17.7374f, 11.6768f, 18.0303f, 11.9697f)
                curveTo(18.3232f, 12.2626f, 18.3232f, 12.7374f, 18.0303f, 13.0303f)
                lineTo(17.5607f, 13.5f)
                lineTo(18.0303f, 13.9697f)
                curveTo(18.3232f, 14.2626f, 18.3232f, 14.7374f, 18.0303f, 15.0303f)
                curveTo(17.7374f, 15.3232f, 17.2626f, 15.3232f, 16.9697f, 15.0303f)
                lineTo(16.5f, 14.5606f)
                lineTo(16.0607f, 15.0f)
                lineTo(16.5303f, 15.4697f)
                curveTo(16.8232f, 15.7626f, 16.8232f, 16.2374f, 16.5303f, 16.5303f)
                curveTo(16.2374f, 16.8232f, 15.7626f, 16.8232f, 15.4697f, 16.5303f)
                lineTo(15.0f, 16.0606f)
                lineTo(14.5607f, 16.5f)
                lineTo(15.0303f, 16.9697f)
                curveTo(15.3232f, 17.2626f, 15.3232f, 17.7374f, 15.0303f, 18.0303f)
                curveTo(14.7374f, 18.3232f, 14.2626f, 18.3232f, 13.9697f, 18.0303f)
                lineTo(13.5f, 17.5606f)
                lineTo(13.0303f, 18.0303f)
                curveTo(12.7374f, 18.3232f, 12.2626f, 18.3232f, 11.9697f, 18.0303f)
                curveTo(11.6768f, 17.7374f, 11.6768f, 17.2626f, 11.9697f, 16.9697f)
                lineTo(12.4393f, 16.5f)
                lineTo(11.9697f, 16.0303f)
                curveTo(11.6768f, 15.7374f, 11.6768f, 15.2626f, 11.9697f, 14.9697f)
                curveTo(12.2626f, 14.6768f, 12.7374f, 14.6768f, 13.0303f, 14.9697f)
                lineTo(13.5f, 15.4393f)
                lineTo(13.9393f, 15.0f)
                lineTo(13.4697f, 14.5303f)
                curveTo(13.1768f, 14.2374f, 13.1768f, 13.7626f, 13.4697f, 13.4697f)
                curveTo(13.7626f, 13.1768f, 14.2374f, 13.1768f, 14.5303f, 13.4697f)
                lineTo(15.0f, 13.9393f)
                lineTo(15.4393f, 13.5f)
                lineTo(14.9697f, 13.0303f)
                curveTo(14.6768f, 12.7374f, 14.6768f, 12.2626f, 14.9697f, 11.9697f)
                close()
            }
        }
            .build()
        return _balls!!
    }

private var _balls: ImageVector? = null
