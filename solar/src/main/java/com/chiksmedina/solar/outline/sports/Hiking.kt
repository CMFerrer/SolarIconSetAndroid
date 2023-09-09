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

public val SportsGroup.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 2.75f)
                curveTo(10.5335f, 2.75f, 9.75f, 3.5335f, 9.75f, 4.5f)
                curveTo(9.75f, 5.4665f, 10.5335f, 6.25f, 11.5f, 6.25f)
                curveTo(12.4665f, 6.25f, 13.25f, 5.4665f, 13.25f, 4.5f)
                curveTo(13.25f, 3.5335f, 12.4665f, 2.75f, 11.5f, 2.75f)
                close()
                moveTo(8.25f, 4.5f)
                curveTo(8.25f, 2.7051f, 9.7051f, 1.25f, 11.5f, 1.25f)
                curveTo(13.2949f, 1.25f, 14.75f, 2.7051f, 14.75f, 4.5f)
                curveTo(14.75f, 6.2949f, 13.2949f, 7.75f, 11.5f, 7.75f)
                curveTo(9.7051f, 7.75f, 8.25f, 6.2949f, 8.25f, 4.5f)
                close()
                moveTo(19.0f, 7.25f)
                curveTo(19.4142f, 7.25f, 19.75f, 7.5858f, 19.75f, 8.0f)
                verticalLineTo(10.4943f)
                curveTo(19.75f, 10.4978f, 19.75f, 10.5014f, 19.75f, 10.5049f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(12.1014f)
                curveTo(17.7655f, 12.5057f, 17.38f, 12.8203f, 16.9431f, 12.9798f)
                curveTo(16.334f, 13.2022f, 15.666f, 13.2022f, 15.0569f, 12.9798f)
                curveTo(14.6042f, 12.8146f, 14.2068f, 12.4828f, 13.6972f, 12.0574f)
                curveTo(13.6666f, 12.0319f, 13.6356f, 12.006f, 13.6042f, 11.9798f)
                lineTo(13.5229f, 11.912f)
                curveTo(13.2914f, 11.7191f, 13.2006f, 11.6439f, 13.0529f, 11.5412f)
                curveTo(12.7954f, 11.362f, 12.2966f, 11.1095f, 11.9998f, 11.0081f)
                curveTo(11.9453f, 10.9894f, 11.9036f, 10.9746f, 11.8715f, 10.9625f)
                curveTo(11.8657f, 10.9602f, 11.8595f, 10.9578f, 11.853f, 10.9553f)
                curveTo(11.6736f, 10.911f, 11.5571f, 10.8829f, 11.4671f, 10.8656f)
                curveTo(11.4166f, 10.856f, 11.3884f, 10.8526f, 11.3754f, 10.8515f)
                curveTo(11.3709f, 10.8529f, 11.3646f, 10.8552f, 11.3563f, 10.8586f)
                curveTo(11.3301f, 10.8695f, 11.297f, 10.8872f, 11.2625f, 10.9116f)
                curveTo(11.228f, 10.9359f, 11.2001f, 10.9611f, 11.1811f, 10.9822f)
                curveTo(11.1722f, 10.992f, 11.1672f, 10.9987f, 11.1649f, 11.0019f)
                curveTo(11.1621f, 11.0092f, 11.1583f, 11.0215f, 11.1534f, 11.0496f)
                curveTo(11.1439f, 11.1029f, 11.1364f, 11.1738f, 11.1217f, 11.3208f)
                lineTo(10.9595f, 12.9425f)
                curveTo(10.866f, 13.8771f, 10.8554f, 14.127f, 10.9207f, 14.3356f)
                curveTo(10.9589f, 14.4577f, 11.0156f, 14.5732f, 11.0888f, 14.6781f)
                curveTo(11.2139f, 14.8574f, 11.4181f, 15.0019f, 12.2146f, 15.4997f)
                curveTo(12.2501f, 15.5219f, 12.2853f, 15.5438f, 12.3199f, 15.5655f)
                curveTo(13.1158f, 16.0625f, 13.6671f, 16.4067f, 14.0654f, 16.9015f)
                curveTo(14.2651f, 17.1497f, 14.4324f, 17.4222f, 14.5632f, 17.7127f)
                curveTo(14.8241f, 18.2918f, 14.8814f, 18.9392f, 14.9642f, 19.8739f)
                curveTo(14.9678f, 19.9146f, 14.9715f, 19.9558f, 14.9752f, 19.9976f)
                lineTo(15.1474f, 21.9335f)
                curveTo(15.1841f, 22.3461f, 14.8794f, 22.7103f, 14.4669f, 22.747f)
                curveTo(14.0543f, 22.7838f, 13.6901f, 22.4791f, 13.6533f, 22.0665f)
                lineTo(13.4811f, 20.1306f)
                curveTo(13.3826f, 19.0236f, 13.3394f, 18.6479f, 13.1956f, 18.3287f)
                curveTo(13.1171f, 18.1545f, 13.0167f, 17.9909f, 12.8969f, 17.842f)
                curveTo(12.6774f, 17.5693f, 12.362f, 17.3607f, 11.4196f, 16.7717f)
                curveTo(11.3819f, 16.7481f, 11.3447f, 16.7249f, 11.3079f, 16.702f)
                curveTo(10.6781f, 16.3092f, 10.1822f, 16.0f, 9.8588f, 15.5368f)
                curveTo(9.6978f, 15.306f, 9.573f, 15.0519f, 9.489f, 14.7833f)
                curveTo(9.3204f, 14.2441f, 9.3792f, 13.6626f, 9.4537f, 12.9242f)
                curveTo(9.4581f, 12.8811f, 9.4625f, 12.8374f, 9.4669f, 12.7932f)
                lineTo(9.6291f, 11.1716f)
                curveTo(9.6307f, 11.1557f, 9.6322f, 11.1397f, 9.6338f, 11.1236f)
                curveTo(9.6564f, 10.8934f, 9.6812f, 10.6394f, 9.8033f, 10.3722f)
                curveTo(9.9394f, 10.0745f, 10.1771f, 9.8416f, 10.3979f, 9.6858f)
                curveTo(10.6187f, 9.5301f, 10.9178f, 9.3843f, 11.244f, 9.3561f)
                curveTo(11.428f, 9.3401f, 11.5998f, 9.3638f, 11.7495f, 9.3925f)
                curveTo(11.8932f, 9.42f, 12.0647f, 9.4624f, 12.2563f, 9.5098f)
                lineTo(12.2817f, 9.5161f)
                curveTo(12.2836f, 9.5166f, 12.2915f, 9.5186f, 12.3005f, 9.521f)
                curveTo(12.3051f, 9.5223f, 12.3155f, 9.5252f, 12.3286f, 9.5293f)
                curveTo(12.3373f, 9.532f, 12.3708f, 9.5426f, 12.4111f, 9.5607f)
                curveTo(12.4163f, 9.563f, 12.423f, 9.5661f, 12.431f, 9.57f)
                curveTo(12.4439f, 9.5745f, 12.4615f, 9.5807f, 12.4849f, 9.5887f)
                curveTo(12.9137f, 9.7352f, 13.5377f, 10.0511f, 13.9096f, 10.3099f)
                curveTo(14.1147f, 10.4527f, 14.2517f, 10.5668f, 14.4711f, 10.7496f)
                lineTo(14.4831f, 10.7597f)
                lineTo(14.5645f, 10.8275f)
                curveTo(15.213f, 11.3679f, 15.3971f, 11.5072f, 15.5713f, 11.5708f)
                curveTo(15.8482f, 11.6719f, 16.1518f, 11.6719f, 16.4287f, 11.5708f)
                curveTo(16.6029f, 11.5072f, 16.787f, 11.3679f, 17.4355f, 10.8275f)
                lineTo(18.25f, 10.1487f)
                verticalLineTo(8.0f)
                curveTo(18.25f, 7.5858f, 18.5858f, 7.25f, 19.0f, 7.25f)
                close()
                moveTo(12.3752f, 10.9443f)
                curveTo(12.3723f, 10.9454f, 12.3704f, 10.9462f, 12.3697f, 10.9464f)
                curveTo(12.3677f, 10.9472f, 12.3665f, 10.9476f, 12.3663f, 10.9477f)
                curveTo(12.366f, 10.9478f, 12.3695f, 10.9465f, 12.3752f, 10.9443f)
                close()
                moveTo(11.8291f, 9.5472f)
                curveTo(11.8298f, 9.547f, 11.8305f, 9.5467f, 11.8311f, 9.5464f)
                curveTo(11.8356f, 9.5447f, 11.8444f, 9.5414f, 11.838f, 9.5438f)
                curveTo(11.8372f, 9.5441f, 11.8338f, 9.5454f, 11.8291f, 9.5472f)
                close()
                moveTo(8.7115f, 9.7628f)
                curveTo(8.8425f, 10.1558f, 8.6301f, 10.5805f, 8.2372f, 10.7115f)
                lineTo(6.5652f, 11.2688f)
                curveTo(6.0784f, 11.4311f, 5.75f, 11.8867f, 5.75f, 12.3998f)
                curveTo(5.75f, 12.4836f, 5.7973f, 12.5601f, 5.8722f, 12.5976f)
                lineTo(8.3354f, 13.8292f)
                curveTo(8.7059f, 14.0144f, 8.8561f, 14.4649f, 8.6708f, 14.8354f)
                curveTo(8.4856f, 15.2059f, 8.0351f, 15.3561f, 7.6646f, 15.1708f)
                lineTo(5.2014f, 13.9392f)
                curveTo(4.6183f, 13.6477f, 4.25f, 13.0517f, 4.25f, 12.3998f)
                curveTo(4.25f, 11.241f, 4.9915f, 10.2123f, 6.0908f, 9.8458f)
                lineTo(7.7628f, 9.2885f)
                curveTo(8.1558f, 9.1575f, 8.5805f, 9.3699f, 8.7115f, 9.7628f)
                close()
                moveTo(9.416f, 16.876f)
                curveTo(9.7607f, 17.1057f, 9.8538f, 17.5714f, 9.624f, 17.916f)
                lineTo(6.624f, 22.416f)
                curveTo(6.3943f, 22.7607f, 5.9286f, 22.8538f, 5.584f, 22.624f)
                curveTo(5.2393f, 22.3943f, 5.1462f, 21.9286f, 5.376f, 21.584f)
                lineTo(8.376f, 17.084f)
                curveTo(8.6057f, 16.7393f, 9.0714f, 16.6462f, 9.416f, 16.876f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
