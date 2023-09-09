package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.861f, 3.1634f)
                curveTo(17.9137f, 3.181f, 17.967f, 3.1988f, 18.0211f, 3.2168f)
                lineTo(19.2231f, 3.6175f)
                curveTo(19.6863f, 3.7718f, 20.0922f, 3.9071f, 20.4142f, 4.0569f)
                curveTo(20.7623f, 4.2189f, 21.0814f, 4.4275f, 21.3253f, 4.7659f)
                curveTo(21.5692f, 5.1043f, 21.6662f, 5.4729f, 21.7098f, 5.8544f)
                curveTo(21.7501f, 6.2073f, 21.75f, 6.6351f, 21.75f, 7.1233f)
                verticalLineTo(15.3359f)
                curveTo(21.75f, 16.0343f, 21.75f, 16.6234f, 21.6959f, 17.089f)
                curveTo(21.6397f, 17.5728f, 21.5136f, 18.0511f, 21.161f, 18.4369f)
                curveTo(20.9519f, 18.6658f, 20.6978f, 18.8489f, 20.4146f, 18.9749f)
                curveTo(19.9371f, 19.1874f, 19.4435f, 19.1557f, 18.9667f, 19.0561f)
                curveTo(18.5078f, 18.9602f, 17.949f, 18.7739f, 17.2865f, 18.5531f)
                lineTo(17.2438f, 18.5388f)
                curveTo(16.1233f, 18.1653f, 15.7393f, 18.049f, 15.3665f, 18.0617f)
                curveTo(15.218f, 18.0668f, 15.0703f, 18.0865f, 14.9257f, 18.1207f)
                curveTo(14.5627f, 18.2065f, 14.2229f, 18.4198f, 13.2401f, 19.075f)
                lineTo(11.8577f, 19.9966f)
                curveTo(11.8103f, 20.0282f, 11.7635f, 20.0594f, 11.7173f, 20.0903f)
                curveTo(10.6558f, 20.7988f, 9.9175f, 21.2915f, 9.0545f, 21.4071f)
                curveTo(8.1914f, 21.5227f, 7.3495f, 21.2416f, 6.139f, 20.8373f)
                curveTo(6.0863f, 20.8197f, 6.033f, 20.8019f, 5.9789f, 20.7839f)
                lineTo(4.7768f, 20.3832f)
                curveTo(4.3137f, 20.2288f, 3.9078f, 20.0936f, 3.5858f, 19.9438f)
                curveTo(3.2377f, 19.7818f, 2.9186f, 19.5732f, 2.6747f, 19.2348f)
                curveTo(2.4308f, 18.8964f, 2.3338f, 18.5278f, 2.2902f, 18.1463f)
                curveTo(2.2499f, 17.7934f, 2.25f, 17.3655f, 2.25f, 16.8774f)
                lineTo(2.25f, 8.6648f)
                curveTo(2.25f, 7.9663f, 2.25f, 7.3773f, 2.3041f, 6.9116f)
                curveTo(2.3603f, 6.4278f, 2.4864f, 5.9496f, 2.839f, 5.5638f)
                curveTo(3.0481f, 5.3349f, 3.3022f, 5.1517f, 3.5854f, 5.0257f)
                curveTo(4.0629f, 4.8133f, 4.5565f, 4.8449f, 5.0333f, 4.9446f)
                curveTo(5.4922f, 5.0404f, 6.051f, 5.2267f, 6.7136f, 5.4476f)
                lineTo(6.7562f, 5.4618f)
                curveTo(7.8767f, 5.8354f, 8.2607f, 5.9517f, 8.6335f, 5.939f)
                curveTo(8.782f, 5.9339f, 8.9297f, 5.9142f, 9.0743f, 5.88f)
                curveTo(9.4373f, 5.7941f, 9.7771f, 5.5809f, 10.7599f, 4.9257f)
                lineTo(12.1423f, 4.0041f)
                curveTo(12.1897f, 3.9725f, 12.2365f, 3.9412f, 12.2827f, 3.9104f)
                curveTo(13.3442f, 3.2019f, 14.0825f, 2.7091f, 14.9455f, 2.5935f)
                curveTo(15.8086f, 2.478f, 16.6505f, 2.7591f, 17.861f, 3.1634f)
                close()
                moveTo(15.75f, 4.1058f)
                verticalLineTo(16.5796f)
                curveTo(16.2857f, 16.6377f, 16.8498f, 16.826f, 17.5931f, 17.0741f)
                curveTo(17.6342f, 17.0878f, 17.6759f, 17.1017f, 17.7182f, 17.1158f)
                curveTo(18.4348f, 17.3547f, 18.9103f, 17.5119f, 19.2735f, 17.5878f)
                curveTo(19.6287f, 17.6621f, 19.7505f, 17.6286f, 19.8049f, 17.6044f)
                curveTo(19.8993f, 17.5624f, 19.984f, 17.5014f, 20.0537f, 17.4251f)
                curveTo(20.0938f, 17.3812f, 20.164f, 17.2762f, 20.2059f, 16.9158f)
                curveTo(20.2488f, 16.5472f, 20.25f, 16.0464f, 20.25f, 15.291f)
                verticalLineTo(7.1626f)
                curveTo(20.25f, 6.6235f, 20.2489f, 6.2822f, 20.2195f, 6.0245f)
                curveTo(20.1922f, 5.786f, 20.1477f, 5.6974f, 20.1084f, 5.6429f)
                curveTo(20.0692f, 5.5885f, 19.9992f, 5.5182f, 19.7815f, 5.417f)
                curveTo(19.5464f, 5.3075f, 19.2229f, 5.1985f, 18.7115f, 5.0281f)
                lineTo(17.5467f, 4.6398f)
                curveTo(16.6604f, 4.3444f, 16.1345f, 4.1763f, 15.75f, 4.1058f)
                close()
                moveTo(14.25f, 16.7599f)
                verticalLineTo(4.4337f)
                curveTo(13.9388f, 4.6135f, 13.5397f, 4.8753f, 12.9744f, 5.2521f)
                lineTo(11.592f, 6.1737f)
                curveTo(11.5549f, 6.1984f, 11.5184f, 6.2228f, 11.4823f, 6.2469f)
                curveTo(10.794f, 6.7062f, 10.281f, 7.0486f, 9.75f, 7.2407f)
                verticalLineTo(19.567f)
                curveTo(10.0612f, 19.3871f, 10.4603f, 19.1254f, 11.0256f, 18.7485f)
                lineTo(12.408f, 17.8269f)
                curveTo(12.4451f, 17.8022f, 12.4816f, 17.7778f, 12.5177f, 17.7538f)
                curveTo(13.206f, 17.2945f, 13.719f, 16.9521f, 14.25f, 16.7599f)
                close()
                moveTo(8.25f, 19.8949f)
                verticalLineTo(7.4211f)
                curveTo(7.7143f, 7.363f, 7.1502f, 7.1747f, 6.4069f, 6.9266f)
                curveTo(6.3658f, 6.9129f, 6.3241f, 6.8989f, 6.2818f, 6.8849f)
                curveTo(5.5652f, 6.646f, 5.0897f, 6.4887f, 4.7265f, 6.4128f)
                curveTo(4.3713f, 6.3386f, 4.2495f, 6.372f, 4.1951f, 6.3962f)
                curveTo(4.1007f, 6.4382f, 4.016f, 6.4993f, 3.9463f, 6.5756f)
                curveTo(3.9062f, 6.6195f, 3.836f, 6.7245f, 3.7941f, 7.0849f)
                curveTo(3.7512f, 7.4535f, 3.75f, 7.9543f, 3.75f, 8.7097f)
                verticalLineTo(16.8381f)
                curveTo(3.75f, 17.3771f, 3.7511f, 17.7184f, 3.7806f, 17.9761f)
                curveTo(3.8078f, 18.2146f, 3.8523f, 18.3033f, 3.8916f, 18.3577f)
                curveTo(3.9308f, 18.4122f, 4.0008f, 18.4825f, 4.2185f, 18.5837f)
                curveTo(4.4536f, 18.6931f, 4.7771f, 18.8021f, 5.2885f, 18.9726f)
                lineTo(6.4533f, 19.3609f)
                curveTo(7.3396f, 19.6563f, 7.8655f, 19.8244f, 8.25f, 19.8949f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
