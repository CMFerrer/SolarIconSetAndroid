package com.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ListGroup

val ListGroup.Playlist2: ImageVector
    get() {
        if (_playlist2 != null) {
            return _playlist2!!
        }
        _playlist2 = Builder(
            name = "Playlist2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 5.0f)
                curveTo(2.25f, 4.5858f, 2.5858f, 4.25f, 3.0f, 4.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 4.25f, 15.75f, 4.5858f, 15.75f, 5.0f)
                curveTo(15.75f, 5.4142f, 15.4142f, 5.75f, 15.0f, 5.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 5.75f, 2.25f, 5.4142f, 2.25f, 5.0f)
                close()
                moveTo(19.8632f, 7.4004f)
                curveTo(19.667f, 7.4727f, 19.4083f, 7.5959f, 18.9996f, 7.7921f)
                lineTo(17.2451f, 8.6343f)
                curveTo(17.0656f, 8.7204f, 16.9633f, 8.77f, 16.8888f, 8.8119f)
                curveTo(16.843f, 8.8377f, 16.8253f, 8.8512f, 16.8207f, 8.855f)
                curveTo(16.7963f, 8.8801f, 16.7774f, 8.9101f, 16.7654f, 8.943f)
                curveTo(16.7639f, 8.9487f, 16.7594f, 8.9705f, 16.756f, 9.023f)
                curveTo(16.7504f, 9.1083f, 16.75f, 9.222f, 16.75f, 9.4211f)
                curveTo(16.75f, 9.8745f, 16.7508f, 10.161f, 16.7705f, 10.3692f)
                curveTo(16.7827f, 10.4972f, 16.7991f, 10.5513f, 16.8044f, 10.5665f)
                curveTo(16.8397f, 10.6108f, 16.889f, 10.6418f, 16.9442f, 10.6545f)
                curveTo(16.9602f, 10.6527f, 17.0161f, 10.6441f, 17.1368f, 10.5996f)
                curveTo(17.333f, 10.5273f, 17.5917f, 10.4041f, 18.0004f, 10.2079f)
                lineTo(19.7549f, 9.3657f)
                curveTo(19.9344f, 9.2796f, 20.0367f, 9.23f, 20.1112f, 9.1881f)
                curveTo(20.1571f, 9.1623f, 20.1748f, 9.1488f, 20.1793f, 9.145f)
                curveTo(20.2037f, 9.1199f, 20.2226f, 9.0899f, 20.2346f, 9.057f)
                curveTo(20.2361f, 9.0513f, 20.2406f, 9.0295f, 20.244f, 8.977f)
                curveTo(20.2496f, 8.8917f, 20.25f, 8.778f, 20.25f, 8.5789f)
                curveTo(20.25f, 8.1255f, 20.2492f, 7.839f, 20.2295f, 7.6308f)
                curveTo(20.2173f, 7.5028f, 20.2009f, 7.4487f, 20.1956f, 7.4335f)
                curveTo(20.1603f, 7.3892f, 20.111f, 7.3582f, 20.0558f, 7.3455f)
                curveTo(20.0398f, 7.3473f, 19.9839f, 7.3559f, 19.8632f, 7.4004f)
                close()
                moveTo(16.7658f, 8.9413f)
                curveTo(16.7659f, 8.9413f, 16.7657f, 8.942f, 16.7654f, 8.943f)
                close()
                moveTo(16.8194f, 8.8562f)
                curveTo(16.8194f, 8.8562f, 16.8198f, 8.8558f, 16.8207f, 8.855f)
                close()
                moveTo(19.3446f, 5.9929f)
                curveTo(19.6232f, 5.8902f, 19.9559f, 5.8021f, 20.3149f, 5.8678f)
                curveTo(20.7572f, 5.9487f, 21.1513f, 6.1967f, 21.4156f, 6.5604f)
                curveTo(21.6302f, 6.8557f, 21.6948f, 7.1937f, 21.7228f, 7.4893f)
                curveTo(21.75f, 7.777f, 21.75f, 8.1358f, 21.75f, 8.5446f)
                verticalLineTo(8.5789f)
                curveTo(21.75f, 8.604f, 21.7501f, 8.6292f, 21.7501f, 8.6545f)
                curveTo(21.7509f, 8.9546f, 21.7518f, 9.2752f, 21.644f, 9.5704f)
                curveTo(21.559f, 9.8035f, 21.4254f, 10.0159f, 21.252f, 10.1934f)
                curveTo(21.0324f, 10.4183f, 20.7431f, 10.5562f, 20.4722f, 10.6854f)
                curveTo(20.4494f, 10.6963f, 20.4266f, 10.7072f, 20.404f, 10.718f)
                lineTo(18.6185f, 11.575f)
                curveTo(18.25f, 11.7519f, 17.9266f, 11.9072f, 17.6554f, 12.0071f)
                curveTo(17.3936f, 12.1036f, 17.0842f, 12.1872f, 16.75f, 12.1425f)
                verticalLineTo(16.4286f)
                curveTo(16.75f, 18.2429f, 15.3147f, 19.75f, 13.5f, 19.75f)
                curveTo(11.6853f, 19.75f, 10.25f, 18.2429f, 10.25f, 16.4286f)
                curveTo(10.25f, 14.6143f, 11.6853f, 13.1071f, 13.5f, 13.1071f)
                curveTo(14.1477f, 13.1071f, 14.747f, 13.2991f, 15.25f, 13.6285f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.2529f)
                curveTo(15.25f, 9.8312f, 15.25f, 9.6489f, 15.25f, 9.4554f)
                lineTo(15.25f, 9.4211f)
                curveTo(15.25f, 9.396f, 15.2499f, 9.3708f, 15.2499f, 9.3455f)
                curveTo(15.2491f, 9.0454f, 15.2482f, 8.7248f, 15.356f, 8.4296f)
                curveTo(15.441f, 8.1965f, 15.5746f, 7.9841f, 15.748f, 7.8066f)
                curveTo(15.9676f, 7.5817f, 16.2569f, 7.4438f, 16.5278f, 7.3146f)
                curveTo(16.5506f, 7.3037f, 16.5734f, 7.2928f, 16.596f, 7.282f)
                lineTo(18.3814f, 6.425f)
                curveTo(18.75f, 6.2481f, 19.0734f, 6.0928f, 19.3446f, 5.9929f)
                close()
                moveTo(15.25f, 16.4286f)
                curveTo(15.25f, 15.4026f, 14.4467f, 14.6071f, 13.5f, 14.6071f)
                curveTo(12.5533f, 14.6071f, 11.75f, 15.4026f, 11.75f, 16.4286f)
                curveTo(11.75f, 17.4546f, 12.5533f, 18.25f, 13.5f, 18.25f)
                curveTo(14.4467f, 18.25f, 15.25f, 17.4546f, 15.25f, 16.4286f)
                close()
                moveTo(2.25f, 9.0f)
                curveTo(2.25f, 8.5858f, 2.5858f, 8.25f, 3.0f, 8.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 8.25f, 13.75f, 8.5858f, 13.75f, 9.0f)
                curveTo(13.75f, 9.4142f, 13.4142f, 9.75f, 13.0f, 9.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 9.75f, 2.25f, 9.4142f, 2.25f, 9.0f)
                close()
                moveTo(2.25f, 13.0f)
                curveTo(2.25f, 12.5858f, 2.5858f, 12.25f, 3.0f, 12.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 12.25f, 9.75f, 12.5858f, 9.75f, 13.0f)
                curveTo(9.75f, 13.4142f, 9.4142f, 13.75f, 9.0f, 13.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 13.75f, 2.25f, 13.4142f, 2.25f, 13.0f)
                close()
                moveTo(2.25f, 17.0f)
                curveTo(2.25f, 16.5858f, 2.5858f, 16.25f, 3.0f, 16.25f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 16.25f, 8.75f, 16.5858f, 8.75f, 17.0f)
                curveTo(8.75f, 17.4142f, 8.4142f, 17.75f, 8.0f, 17.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 17.75f, 2.25f, 17.4142f, 2.25f, 17.0f)
                close()
            }
        }
            .build()
        return _playlist2!!
    }

private var _playlist2: ImageVector? = null
