package com.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoodKitchenGroup

val FoodKitchenGroup.Bottle: ImageVector
    get() {
        if (_bottle != null) {
            return _bottle!!
        }
        _bottle = Builder(
            name = "Bottle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.8773f, 2.598f)
                curveTo(16.8694f, 2.6123f, 16.8611f, 2.6274f, 16.8522f, 2.6434f)
                lineTo(16.7757f, 2.7817f)
                lineTo(17.6421f, 3.3036f)
                lineTo(17.7204f, 3.1621f)
                curveTo(17.7287f, 3.1472f, 17.7364f, 3.1332f, 17.7437f, 3.1199f)
                curveTo(17.7308f, 3.1121f, 17.717f, 3.1038f, 17.7025f, 3.0951f)
                lineTo(16.9218f, 2.6247f)
                curveTo(16.9061f, 2.6153f, 16.8913f, 2.6064f, 16.8773f, 2.598f)
                close()
                moveTo(17.9306f, 3.2387f)
                curveTo(17.9306f, 3.2387f, 17.9303f, 3.2385f, 17.9298f, 3.238f)
                close()
                moveTo(17.2048f, 4.7913f)
                lineTo(15.733f, 3.9047f)
                lineTo(13.0682f, 5.2144f)
                curveTo(12.9831f, 5.2562f, 12.9487f, 5.2731f, 12.9171f, 5.2894f)
                curveTo(11.9498f, 5.786f, 11.199f, 6.6434f, 10.8073f, 7.6869f)
                lineTo(10.8669f, 7.657f)
                curveTo(12.0721f, 7.0545f, 13.5176f, 7.2076f, 14.5697f, 8.0493f)
                curveTo(15.0873f, 8.4634f, 15.7796f, 8.5869f, 16.4086f, 8.3773f)
                lineTo(17.4637f, 8.0256f)
                curveTo(17.4614f, 7.9955f, 17.4583f, 7.9562f, 17.4532f, 7.8924f)
                lineTo(17.2048f, 4.7913f)
                close()
                moveTo(18.962f, 8.7898f)
                curveTo(19.0062f, 8.6568f, 19.0135f, 8.5104f, 18.9762f, 8.3664f)
                curveTo(18.9761f, 8.2355f, 18.9719f, 8.1041f, 18.9636f, 7.9725f)
                curveTo(18.9603f, 7.9213f, 18.956f, 7.8681f, 18.949f, 7.78f)
                lineTo(18.6873f, 4.5129f)
                lineTo(19.0424f, 3.8711f)
                curveTo(19.0996f, 3.7678f, 19.1619f, 3.6553f, 19.2081f, 3.5533f)
                curveTo(19.2606f, 3.4374f, 19.3192f, 3.2794f, 19.3279f, 3.0866f)
                curveTo(19.3395f, 2.8292f, 19.2713f, 2.5744f, 19.1326f, 2.3572f)
                curveTo(19.0287f, 2.1946f, 18.899f, 2.087f, 18.7956f, 2.0129f)
                curveTo(18.7047f, 1.9476f, 18.5945f, 1.8812f, 18.4934f, 1.8203f)
                lineTo(18.4765f, 1.8102f)
                lineTo(17.678f, 1.3292f)
                curveTo(17.5697f, 1.2639f, 17.4529f, 1.1935f, 17.3471f, 1.1411f)
                curveTo(17.2278f, 1.0821f, 17.0627f, 1.0145f, 16.859f, 1.0022f)
                curveTo(16.5892f, 0.9861f, 16.3215f, 1.0577f, 16.0959f, 1.2066f)
                curveTo(15.9256f, 1.3189f, 15.8163f, 1.46f, 15.7425f, 1.5707f)
                curveTo(15.677f, 1.669f, 15.611f, 1.7883f, 15.5498f, 1.899f)
                lineTo(15.2273f, 2.4819f)
                lineTo(12.3997f, 3.8716f)
                curveTo(12.3235f, 3.909f, 12.2766f, 3.932f, 12.2319f, 3.955f)
                curveTo(10.606f, 4.7899f, 9.4605f, 6.3587f, 9.1156f, 8.188f)
                curveTo(9.1061f, 8.2384f, 9.0971f, 8.291f, 9.0822f, 8.378f)
                lineTo(9.0809f, 8.3852f)
                curveTo(9.065f, 8.4781f, 9.058f, 8.519f, 9.0508f, 8.5585f)
                curveTo(8.7846f, 10.0141f, 8.0939f, 11.3426f, 7.0784f, 12.3644f)
                curveTo(7.0508f, 12.3921f, 7.0221f, 12.4204f, 6.9562f, 12.4851f)
                lineTo(6.1518f, 13.2761f)
                curveTo(5.6478f, 13.7716f, 5.2415f, 14.1712f, 4.9377f, 14.5148f)
                curveTo(4.6276f, 14.8657f, 4.3776f, 15.2087f, 4.2273f, 15.6032f)
                curveTo(3.8262f, 16.6565f, 3.9612f, 17.8503f, 4.5907f, 18.7834f)
                curveTo(4.8268f, 19.1333f, 5.1487f, 19.4089f, 5.5299f, 19.6771f)
                curveTo(5.9031f, 19.9396f, 6.3886f, 20.2321f, 6.9901f, 20.5944f)
                lineTo(7.7031f, 21.0239f)
                curveTo(8.3044f, 21.3861f, 8.79f, 21.6786f, 9.1948f, 21.8848f)
                curveTo(9.6068f, 22.0946f, 10.0015f, 22.2507f, 10.4202f, 22.2901f)
                curveTo(11.5377f, 22.395f, 12.6191f, 21.905f, 13.3001f, 21.0062f)
                curveTo(13.5538f, 20.6714f, 13.7127f, 20.2746f, 13.8478f, 19.8224f)
                curveTo(13.9808f, 19.3773f, 14.109f, 18.8116f, 14.2685f, 18.1074f)
                lineTo(14.5226f, 16.9862f)
                curveTo(14.5434f, 16.8944f, 14.5525f, 16.854f, 14.5618f, 16.815f)
                curveTo(14.9043f, 15.3775f, 15.6637f, 14.0916f, 16.7309f, 13.1304f)
                curveTo(16.7598f, 13.1043f, 16.79f, 13.0777f, 16.8592f, 13.0168f)
                lineTo(16.8647f, 13.012f)
                curveTo(16.9293f, 12.9552f, 16.9687f, 12.9205f, 17.0062f, 12.8863f)
                curveTo(18.164f, 11.8315f, 18.8564f, 10.3548f, 18.962f, 8.7898f)
                close()
                moveTo(17.2962f, 9.6625f)
                lineTo(16.8829f, 9.8003f)
                curveTo(15.7713f, 10.1708f, 14.5476f, 9.9526f, 13.6326f, 9.2206f)
                curveTo(13.0374f, 8.7444f, 12.2196f, 8.6578f, 11.5378f, 8.9987f)
                lineTo(10.3518f, 9.5916f)
                curveTo(9.9529f, 11.0412f, 9.194f, 12.3636f, 8.1423f, 13.4218f)
                curveTo(8.1079f, 13.4563f, 8.0728f, 13.4909f, 8.0116f, 13.5511f)
                lineTo(7.2234f, 14.326f)
                curveTo(6.6948f, 14.8458f, 6.3264f, 15.2087f, 6.0616f, 15.5082f)
                curveTo(5.7991f, 15.8052f, 5.6854f, 15.9894f, 5.6291f, 16.1371f)
                curveTo(5.4006f, 16.7371f, 5.4793f, 17.4184f, 5.8342f, 17.9445f)
                curveTo(5.9209f, 18.073f, 6.0714f, 18.224f, 6.3929f, 18.4502f)
                curveTo(6.7174f, 18.6785f, 7.1569f, 18.9438f, 7.7884f, 19.3241f)
                lineTo(8.4527f, 19.7243f)
                curveTo(9.0842f, 20.1047f, 9.524f, 20.3691f, 9.8754f, 20.5481f)
                curveTo(10.225f, 20.7261f, 10.4206f, 20.7835f, 10.5605f, 20.7966f)
                curveTo(11.1463f, 20.8516f, 11.7281f, 20.5971f, 12.1045f, 20.1003f)
                curveTo(12.1976f, 19.9774f, 12.2944f, 19.782f, 12.4106f, 19.3929f)
                curveTo(12.5274f, 19.0023f, 12.6447f, 18.4864f, 12.8117f, 17.7493f)
                lineTo(13.0607f, 16.6502f)
                curveTo(13.0801f, 16.5644f, 13.0912f, 16.5155f, 13.1027f, 16.4674f)
                curveTo(13.514f, 14.7408f, 14.4286f, 13.1853f, 15.727f, 12.0158f)
                curveTo(15.763f, 11.9834f, 15.7999f, 11.9509f, 15.8638f, 11.8947f)
                lineTo(15.8682f, 11.8908f)
                curveTo(15.94f, 11.8276f, 15.9692f, 11.8019f, 15.9959f, 11.7775f)
                curveTo(16.6179f, 11.2109f, 17.065f, 10.4749f, 17.2962f, 9.6625f)
                close()
            }
        }
            .build()
        return _bottle!!
    }

private var _bottle: ImageVector? = null
