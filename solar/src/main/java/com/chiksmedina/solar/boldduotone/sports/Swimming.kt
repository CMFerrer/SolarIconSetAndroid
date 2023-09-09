package com.chiksmedina.solar.boldduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SportsGroup

public val SportsGroup.Swimming: ImageVector
    get() {
        if (_swimming != null) {
            return _swimming!!
        }
        _swimming = Builder(name = "Swimming", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.57f, 17.8659f)
                curveTo(5.2569f, 16.7921f, 6.7275f, 16.8273f, 7.4577f, 17.762f)
                curveTo(8.4477f, 19.0293f, 9.8296f, 20.2502f, 12.0002f, 20.2502f)
                curveTo(14.2088f, 20.2502f, 15.5699f, 19.2714f, 16.5051f, 18.0211f)
                curveTo(17.2251f, 17.0587f, 18.7909f, 16.9015f, 19.5458f, 18.0437f)
                curveTo(20.1708f, 18.9893f, 20.8488f, 19.7308f, 22.1722f, 20.0426f)
                curveTo(22.5754f, 20.1376f, 22.8252f, 20.5414f, 22.7302f, 20.9446f)
                curveTo(22.6352f, 21.3478f, 22.2313f, 21.5976f, 21.8282f, 21.5026f)
                curveTo(19.9762f, 21.0662f, 19.0206f, 19.9694f, 18.2944f, 18.8707f)
                curveTo(18.2374f, 18.7846f, 18.1519f, 18.7408f, 18.0408f, 18.7429f)
                curveTo(17.9223f, 18.7451f, 17.7936f, 18.8029f, 17.7063f, 18.9197f)
                curveTo(16.5386f, 20.4806f, 14.7604f, 21.7502f, 12.0002f, 21.7502f)
                curveTo(9.1576f, 21.7502f, 7.3888f, 20.1103f, 6.2757f, 18.6855f)
                curveTo(6.2039f, 18.5936f, 6.1103f, 18.5587f, 6.0298f, 18.5604f)
                curveTo(5.9539f, 18.5621f, 5.8844f, 18.5948f, 5.8337f, 18.6742f)
                curveTo(5.0942f, 19.8303f, 4.1393f, 21.0391f, 2.1722f, 21.5026f)
                curveTo(1.769f, 21.5976f, 1.3652f, 21.3478f, 1.2702f, 20.9446f)
                curveTo(1.1752f, 20.5414f, 1.425f, 20.1376f, 1.8282f, 20.0426f)
                curveTo(3.2291f, 19.7125f, 3.9077f, 18.9013f, 4.57f, 17.8659f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.57f, 12.8054f)
                curveTo(5.2569f, 11.7316f, 6.7275f, 11.7668f, 7.4577f, 12.7015f)
                curveTo(8.4477f, 13.9687f, 9.8296f, 15.1897f, 12.0002f, 15.1897f)
                curveTo(14.2088f, 15.1897f, 15.5699f, 14.2108f, 16.5051f, 12.9606f)
                curveTo(17.2251f, 11.9981f, 18.7909f, 11.8409f, 19.5458f, 12.9831f)
                curveTo(20.1708f, 13.9288f, 20.8488f, 14.6702f, 22.1722f, 14.982f)
                curveTo(22.5754f, 15.077f, 22.8252f, 15.4809f, 22.7302f, 15.8841f)
                curveTo(22.6352f, 16.2872f, 22.2313f, 16.5371f, 21.8282f, 16.4421f)
                curveTo(19.9762f, 16.0057f, 19.0206f, 14.9089f, 18.2944f, 13.8102f)
                curveTo(18.2374f, 13.724f, 18.1519f, 13.6802f, 18.0408f, 13.6823f)
                curveTo(17.9223f, 13.6846f, 17.7936f, 13.7423f, 17.7063f, 13.8591f)
                curveTo(16.5386f, 15.42f, 14.7604f, 16.6897f, 12.0002f, 16.6897f)
                curveTo(9.1576f, 16.6897f, 7.3888f, 15.0498f, 6.2757f, 13.6249f)
                curveTo(6.2039f, 13.5331f, 6.1103f, 13.4981f, 6.0298f, 13.4999f)
                curveTo(5.9539f, 13.5015f, 5.8844f, 13.5343f, 5.8337f, 13.6136f)
                curveTo(5.0942f, 14.7697f, 4.1393f, 15.9785f, 2.1722f, 16.4421f)
                curveTo(1.769f, 16.5371f, 1.3652f, 16.2872f, 1.2702f, 15.8841f)
                curveTo(1.1752f, 15.4809f, 1.425f, 15.077f, 1.8282f, 14.982f)
                curveTo(3.2291f, 14.6519f, 3.9077f, 13.8408f, 4.57f, 12.8054f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 5.5f)
                curveTo(19.5f, 6.8807f, 18.3808f, 8.0f, 17.0f, 8.0f)
                curveTo(15.6193f, 8.0f, 14.5f, 6.8807f, 14.5f, 5.5f)
                curveTo(14.5f, 4.1193f, 15.6193f, 3.0f, 17.0f, 3.0f)
                curveTo(18.3808f, 3.0f, 19.5f, 4.1193f, 19.5f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6456f, 12.7938f)
                lineTo(15.5f, 11.5f)
                lineTo(9.0008f, 4.1342f)
                curveTo(8.4585f, 3.5196f, 7.5101f, 3.49f, 6.9305f, 4.0695f)
                curveTo(6.4055f, 4.5946f, 6.3732f, 5.4353f, 6.8564f, 5.9991f)
                lineTo(7.8441f, 7.1514f)
                curveTo(8.4486f, 7.8566f, 7.477f, 9.4138f, 7.477f, 9.4138f)
                lineTo(5.1152f, 12.2589f)
                curveTo(5.8629f, 11.7897f, 6.8866f, 11.9706f, 7.4576f, 12.7015f)
                curveTo(8.4476f, 13.9687f, 9.8295f, 15.1897f, 12.0f, 15.1897f)
                curveTo(14.2087f, 15.1897f, 15.5698f, 14.2108f, 16.505f, 12.9606f)
                curveTo(16.5489f, 12.902f, 16.5959f, 12.8464f, 16.6456f, 12.7938f)
                close()
            }
        }
        .build()
        return _swimming!!
    }

private var _swimming: ImageVector? = null
