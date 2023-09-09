package com.chiksmedina.solar.outline.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ShoppingEcommerceGroup

public val ShoppingEcommerceGroup.BagMusic: ImageVector
    get() {
        if (_bagMusic != null) {
            return _bagMusic!!
        }
        _bagMusic = Builder(name = "BagMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(10.7574f, 2.75f, 9.75f, 3.7574f, 9.75f, 5.0f)
                verticalLineTo(5.2599f)
                curveTo(10.3071f, 5.25f, 10.9183f, 5.25f, 11.5891f, 5.25f)
                horizontalLineTo(12.4109f)
                curveTo(13.0817f, 5.25f, 13.6929f, 5.25f, 14.25f, 5.2599f)
                verticalLineTo(5.0f)
                curveTo(14.25f, 3.7574f, 13.2426f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(15.75f, 5.3279f)
                verticalLineTo(5.0f)
                curveTo(15.75f, 2.9289f, 14.0711f, 1.25f, 12.0f, 1.25f)
                curveTo(9.9289f, 1.25f, 8.25f, 2.9289f, 8.25f, 5.0f)
                verticalLineTo(5.3279f)
                curveTo(8.1073f, 5.3402f, 7.9693f, 5.3544f, 7.8361f, 5.3709f)
                curveTo(6.8261f, 5.4957f, 5.9935f, 5.7578f, 5.2862f, 6.3448f)
                curveTo(4.5789f, 6.9318f, 4.1678f, 7.7019f, 3.859f, 8.6716f)
                curveTo(3.5598f, 9.6113f, 3.3333f, 10.8194f, 3.0485f, 12.3381f)
                lineTo(3.0278f, 12.4484f)
                curveTo(2.6261f, 14.5912f, 2.3094f, 16.2799f, 2.2513f, 17.6112f)
                curveTo(2.1917f, 18.9758f, 2.3948f, 20.106f, 3.1645f, 21.0335f)
                curveTo(3.9343f, 21.961f, 5.0077f, 22.3689f, 6.3599f, 22.5618f)
                curveTo(7.6791f, 22.75f, 9.3973f, 22.75f, 11.5774f, 22.75f)
                horizontalLineTo(12.4226f)
                curveTo(14.6027f, 22.75f, 16.3208f, 22.75f, 17.6401f, 22.5618f)
                curveTo(18.9923f, 22.3689f, 20.0657f, 21.961f, 20.8355f, 21.0335f)
                curveTo(21.6052f, 20.106f, 21.8082f, 18.9758f, 21.7487f, 17.6112f)
                curveTo(21.6906f, 16.2799f, 21.3739f, 14.5912f, 20.9721f, 12.4484f)
                lineTo(20.9515f, 12.3381f)
                curveTo(20.6667f, 10.8194f, 20.4402f, 9.6113f, 20.141f, 8.6716f)
                curveTo(19.8322f, 7.7019f, 19.4211f, 6.9318f, 18.7138f, 6.3448f)
                curveTo(18.0065f, 5.7578f, 17.1739f, 5.4957f, 16.1639f, 5.3709f)
                curveTo(16.0306f, 5.3544f, 15.8927f, 5.3402f, 15.75f, 5.3279f)
                close()
                moveTo(8.02f, 6.8596f)
                curveTo(7.1645f, 6.9653f, 6.6477f, 7.1641f, 6.2441f, 7.4991f)
                curveTo(5.8405f, 7.8341f, 5.5499f, 8.3053f, 5.2883f, 9.1267f)
                curveTo(5.0205f, 9.9679f, 4.8097f, 11.0846f, 4.5136f, 12.6639f)
                curveTo(4.0979f, 14.8811f, 3.8028f, 16.4647f, 3.7499f, 17.6766f)
                curveTo(3.6979f, 18.8679f, 3.889f, 19.5576f, 4.3188f, 20.0756f)
                curveTo(4.7486f, 20.5935f, 5.3914f, 20.9084f, 6.5718f, 21.0768f)
                curveTo(7.7727f, 21.2482f, 9.3836f, 21.25f, 11.6394f, 21.25f)
                horizontalLineTo(12.3606f)
                curveTo(14.6164f, 21.25f, 16.2273f, 21.2482f, 17.4282f, 21.0768f)
                curveTo(18.6086f, 20.9084f, 19.2513f, 20.5935f, 19.6812f, 20.0756f)
                curveTo(20.111f, 19.5576f, 20.3021f, 18.8679f, 20.2501f, 17.6766f)
                curveTo(20.1972f, 16.4647f, 19.9021f, 14.8811f, 19.4864f, 12.6639f)
                curveTo(19.1903f, 11.0846f, 18.9795f, 9.9679f, 18.7117f, 9.1267f)
                curveTo(18.4501f, 8.3053f, 18.1595f, 7.8341f, 17.7559f, 7.4991f)
                curveTo(17.3523f, 7.1641f, 16.8355f, 6.9653f, 15.98f, 6.8596f)
                curveTo(15.1038f, 6.7513f, 13.9674f, 6.75f, 12.3606f, 6.75f)
                horizontalLineTo(11.6394f)
                curveTo(10.0326f, 6.75f, 8.8961f, 6.7513f, 8.02f, 6.8596f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.9785f, 10.3689f)
                curveTo(14.9705f, 10.3712f, 14.9382f, 10.381f, 14.8684f, 10.4114f)
                curveTo(14.7604f, 10.4585f, 14.6183f, 10.5293f, 14.3938f, 10.6416f)
                lineTo(13.077f, 11.2999f)
                curveTo(12.9812f, 11.3478f, 12.9266f, 11.3753f, 12.886f, 11.3974f)
                curveTo(12.8606f, 11.4113f, 12.8502f, 11.418f, 12.8477f, 11.4197f)
                curveTo(12.7993f, 11.4569f, 12.7662f, 11.5105f, 12.7546f, 11.5704f)
                curveTo(12.7542f, 11.5735f, 12.7528f, 11.5857f, 12.7517f, 11.6146f)
                curveTo(12.7501f, 11.6609f, 12.75f, 11.722f, 12.75f, 11.8291f)
                curveTo(12.75f, 12.0801f, 12.7502f, 12.2389f, 12.7564f, 12.3566f)
                curveTo(12.7604f, 12.4326f, 12.7661f, 12.4658f, 12.7676f, 12.4741f)
                curveTo(12.8083f, 12.5767f, 12.9115f, 12.6405f, 13.0215f, 12.631f)
                curveTo(13.0295f, 12.6286f, 13.0617f, 12.6189f, 13.1316f, 12.5884f)
                curveTo(13.2396f, 12.5413f, 13.3817f, 12.4705f, 13.6062f, 12.3583f)
                lineTo(14.9229f, 11.6999f)
                curveTo(15.0188f, 11.652f, 15.0734f, 11.6246f, 15.114f, 11.6025f)
                curveTo(15.1394f, 11.5886f, 15.1498f, 11.5819f, 15.1523f, 11.5801f)
                curveTo(15.2007f, 11.543f, 15.2338f, 11.4894f, 15.2454f, 11.4295f)
                curveTo(15.2458f, 11.4264f, 15.2472f, 11.4142f, 15.2482f, 11.3852f)
                curveTo(15.2499f, 11.339f, 15.25f, 11.2779f, 15.25f, 11.1708f)
                curveTo(15.25f, 10.9198f, 15.2497f, 10.7609f, 15.2436f, 10.6433f)
                curveTo(15.2396f, 10.5672f, 15.2339f, 10.534f, 15.2324f, 10.5258f)
                curveTo(15.1917f, 10.4232f, 15.0885f, 10.3594f, 14.9785f, 10.3689f)
                close()
                moveTo(14.7972f, 8.8798f)
                curveTo(15.6037f, 8.7857f, 16.3689f, 9.2586f, 16.6454f, 10.022f)
                curveTo(16.7134f, 10.2098f, 16.7328f, 10.4001f, 16.7415f, 10.5645f)
                curveTo(16.75f, 10.7264f, 16.75f, 10.9253f, 16.75f, 11.152f)
                verticalLineTo(11.1708f)
                curveTo(16.75f, 11.1843f, 16.75f, 11.1979f, 16.75f, 11.2116f)
                curveTo(16.7503f, 11.3735f, 16.7505f, 11.5452f, 16.7188f, 11.7109f)
                curveTo(16.638f, 12.1332f, 16.4045f, 12.511f, 16.0629f, 12.7721f)
                curveTo(15.9289f, 12.8746f, 15.7752f, 12.9512f, 15.6303f, 13.0234f)
                curveTo(15.618f, 13.0295f, 15.6059f, 13.0355f, 15.5938f, 13.0416f)
                lineTo(14.2603f, 13.7083f)
                curveTo(14.0575f, 13.8097f, 13.8796f, 13.8987f, 13.731f, 13.9635f)
                curveTo(13.5801f, 14.0292f, 13.4012f, 14.097f, 13.2028f, 14.1201f)
                curveTo(13.0493f, 14.138f, 12.8974f, 14.1354f, 12.75f, 14.1141f)
                verticalLineTo(16.9999f)
                curveTo(12.75f, 18.5187f, 11.5188f, 19.7499f, 10.0f, 19.7499f)
                curveTo(8.4812f, 19.7499f, 7.25f, 18.5187f, 7.25f, 16.9999f)
                curveTo(7.25f, 15.4811f, 8.4812f, 14.2499f, 10.0f, 14.2499f)
                curveTo(10.4501f, 14.2499f, 10.875f, 14.3581f, 11.25f, 14.5498f)
                verticalLineTo(11.9999f)
                curveTo(11.2499f, 11.9508f, 11.25f, 11.9f, 11.25f, 11.8478f)
                verticalLineTo(11.8291f)
                curveTo(11.25f, 11.8156f, 11.25f, 11.802f, 11.25f, 11.7883f)
                curveTo(11.2497f, 11.6264f, 11.2495f, 11.4547f, 11.2812f, 11.289f)
                curveTo(11.362f, 10.8667f, 11.5955f, 10.4889f, 11.9371f, 10.2278f)
                curveTo(12.0711f, 10.1253f, 12.2248f, 10.0487f, 12.3697f, 9.9765f)
                curveTo(12.3819f, 9.9704f, 12.3941f, 9.9643f, 12.4062f, 9.9583f)
                lineTo(13.7397f, 9.2916f)
                curveTo(13.9425f, 9.1902f, 14.1204f, 9.1012f, 14.269f, 9.0364f)
                curveTo(14.4199f, 8.9706f, 14.5988f, 8.9029f, 14.7972f, 8.8798f)
                close()
                moveTo(11.25f, 16.9999f)
                curveTo(11.25f, 16.3096f, 10.6904f, 15.7499f, 10.0f, 15.7499f)
                curveTo(9.3096f, 15.7499f, 8.75f, 16.3096f, 8.75f, 16.9999f)
                curveTo(8.75f, 17.6903f, 9.3096f, 18.2499f, 10.0f, 18.2499f)
                curveTo(10.6904f, 18.2499f, 11.25f, 17.6903f, 11.25f, 16.9999f)
                close()
            }
        }
        .build()
        return _bagMusic!!
    }

private var _bagMusic: ImageVector? = null
