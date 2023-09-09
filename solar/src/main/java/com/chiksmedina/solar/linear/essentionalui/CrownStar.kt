package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.CrownStar: ImageVector
    get() {
        if (_crownStar != null) {
            return _crownStar!!
        }
        _crownStar = Builder(name = "CrownStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.609f, 13.5616f)
                lineTo(21.8382f, 11.1263f)
                curveTo(22.0182f, 9.2137f, 22.1082f, 8.2574f, 21.781f, 7.8621f)
                curveTo(21.604f, 7.6482f, 21.3633f, 7.5172f, 21.106f, 7.4946f)
                curveTo(20.6303f, 7.4528f, 20.0329f, 8.1329f, 18.8381f, 9.4931f)
                curveTo(18.2202f, 10.1965f, 17.9113f, 10.5482f, 17.5666f, 10.6027f)
                curveTo(17.3757f, 10.6328f, 17.1811f, 10.6018f, 17.0047f, 10.5131f)
                curveTo(16.6865f, 10.3529f, 16.4743f, 9.9181f, 16.0499f, 9.0485f)
                lineTo(13.8131f, 4.4648f)
                curveTo(13.0112f, 2.8216f, 12.6102f, 2.0f, 12.0f, 2.0f)
                curveTo(11.3898f, 2.0f, 10.9888f, 2.8216f, 10.1869f, 4.4649f)
                lineTo(7.9501f, 9.0485f)
                curveTo(7.5257f, 9.9181f, 7.3135f, 10.3529f, 6.9953f, 10.5131f)
                curveTo(6.8189f, 10.6018f, 6.6243f, 10.6328f, 6.4334f, 10.6027f)
                curveTo(6.0887f, 10.5482f, 5.7798f, 10.1965f, 5.1619f, 9.4931f)
                curveTo(3.9671f, 8.1329f, 3.3697f, 7.4528f, 2.894f, 7.4946f)
                curveTo(2.6367f, 7.5172f, 2.396f, 7.6482f, 2.219f, 7.8621f)
                curveTo(1.8918f, 8.2574f, 1.9818f, 9.2137f, 2.1618f, 11.1263f)
                lineTo(2.391f, 13.5616f)
                curveTo(2.7687f, 17.5742f, 2.9575f, 19.5805f, 4.1401f, 20.7902f)
                curveTo(5.3227f, 22.0f, 7.0952f, 22.0f, 10.6401f, 22.0f)
                horizontalLineTo(13.3599f)
                curveTo(16.9048f, 22.0f, 18.6773f, 22.0f, 19.8599f, 20.7902f)
                curveTo(21.0425f, 19.5805f, 21.2313f, 17.5742f, 21.609f, 13.5616f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.1459f, 12.5227f)
                curveTo(11.5259f, 11.841f, 11.7159f, 11.5002f, 12.0f, 11.5002f)
                curveTo(12.2841f, 11.5002f, 12.4741f, 11.841f, 12.8541f, 12.5227f)
                lineTo(12.9524f, 12.6991f)
                curveTo(13.0603f, 12.8928f, 13.1143f, 12.9896f, 13.1985f, 13.0535f)
                curveTo(13.2827f, 13.1174f, 13.3875f, 13.1412f, 13.5972f, 13.1886f)
                lineTo(13.7881f, 13.2318f)
                curveTo(14.526f, 13.3987f, 14.895f, 13.4822f, 14.9828f, 13.7645f)
                curveTo(15.0706f, 14.0468f, 14.819f, 14.3409f, 14.316f, 14.9292f)
                lineTo(14.1858f, 15.0813f)
                curveTo(14.0429f, 15.2485f, 13.9714f, 15.3321f, 13.9392f, 15.4355f)
                curveTo(13.9071f, 15.5389f, 13.9179f, 15.6504f, 13.9395f, 15.8734f)
                lineTo(13.9592f, 16.0765f)
                curveTo(14.0352f, 16.8614f, 14.0733f, 17.2538f, 13.8435f, 17.4282f)
                curveTo(13.6136f, 17.6027f, 13.2682f, 17.4436f, 12.5773f, 17.1255f)
                lineTo(12.3986f, 17.0432f)
                curveTo(12.2022f, 16.9528f, 12.1041f, 16.9076f, 12.0f, 16.9076f)
                curveTo(11.8959f, 16.9076f, 11.7978f, 16.9528f, 11.6014f, 17.0432f)
                lineTo(11.4227f, 17.1255f)
                curveTo(10.7318f, 17.4436f, 10.3864f, 17.6027f, 10.1565f, 17.4282f)
                curveTo(9.9267f, 17.2538f, 9.9648f, 16.8614f, 10.0408f, 16.0765f)
                lineTo(10.0605f, 15.8734f)
                curveTo(10.0821f, 15.6504f, 10.0929f, 15.5389f, 10.0608f, 15.4355f)
                curveTo(10.0286f, 15.3321f, 9.9571f, 15.2485f, 9.8142f, 15.0813f)
                lineTo(9.684f, 14.9292f)
                curveTo(9.181f, 14.3409f, 8.9295f, 14.0468f, 9.0172f, 13.7645f)
                curveTo(9.105f, 13.4822f, 9.474f, 13.3987f, 10.2119f, 13.2318f)
                lineTo(10.4028f, 13.1886f)
                curveTo(10.6125f, 13.1412f, 10.7173f, 13.1174f, 10.8015f, 13.0535f)
                curveTo(10.8857f, 12.9896f, 10.9397f, 12.8928f, 11.0476f, 12.6991f)
                lineTo(11.1459f, 12.5227f)
                close()
            }
        }
        .build()
        return _crownStar!!
    }

private var _crownStar: ImageVector? = null
