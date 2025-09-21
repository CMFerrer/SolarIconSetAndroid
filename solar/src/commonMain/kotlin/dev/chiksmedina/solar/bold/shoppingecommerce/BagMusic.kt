package dev.chiksmedina.solar.bold.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.BagMusic: ImageVector
    get() {
        if (_bagMusic != null) {
            return _bagMusic!!
        }
        _bagMusic = Builder(
            name = "BagMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.8684f, 10.4115f)
                curveTo(14.9382f, 10.381f, 14.9705f, 10.3713f, 14.9785f, 10.3689f)
                curveTo(15.0884f, 10.3594f, 15.1917f, 10.4232f, 15.2324f, 10.5258f)
                curveTo(15.2339f, 10.5341f, 15.2395f, 10.5673f, 15.2435f, 10.6433f)
                curveTo(15.2497f, 10.761f, 15.25f, 10.9198f, 15.25f, 11.1708f)
                curveTo(15.25f, 11.2779f, 15.2499f, 11.339f, 15.2482f, 11.3853f)
                curveTo(15.2472f, 11.4142f, 15.2458f, 11.4264f, 15.2454f, 11.4295f)
                curveTo(15.2338f, 11.4894f, 15.2007f, 11.543f, 15.1523f, 11.5802f)
                curveTo(15.1497f, 11.5819f, 15.1394f, 11.5886f, 15.114f, 11.6025f)
                curveTo(15.0733f, 11.6246f, 15.0188f, 11.6521f, 14.9229f, 11.7f)
                lineTo(13.6062f, 12.3583f)
                curveTo(13.3817f, 12.4706f, 13.2396f, 12.5414f, 13.1316f, 12.5885f)
                curveTo(13.0617f, 12.6189f, 13.0295f, 12.6287f, 13.0214f, 12.631f)
                curveTo(12.9115f, 12.6405f, 12.8083f, 12.5767f, 12.7676f, 12.4741f)
                curveTo(12.7661f, 12.4659f, 12.7604f, 12.4327f, 12.7564f, 12.3566f)
                curveTo(12.7502f, 12.239f, 12.75f, 12.0801f, 12.75f, 11.8291f)
                curveTo(12.75f, 11.722f, 12.7501f, 11.6609f, 12.7517f, 11.6147f)
                curveTo(12.7528f, 11.5857f, 12.7541f, 11.5735f, 12.7546f, 11.5704f)
                curveTo(12.7662f, 11.5105f, 12.7993f, 11.4569f, 12.8477f, 11.4198f)
                curveTo(12.8502f, 11.418f, 12.8606f, 11.4113f, 12.886f, 11.3975f)
                curveTo(12.9266f, 11.3753f, 12.9812f, 11.3479f, 13.077f, 11.3f)
                lineTo(14.3938f, 10.6416f)
                curveTo(14.6183f, 10.5294f, 14.7604f, 10.4586f, 14.8684f, 10.4115f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 15.75f)
                curveTo(10.6903f, 15.75f, 11.25f, 16.3096f, 11.25f, 17.0f)
                curveTo(11.25f, 17.6903f, 10.6903f, 18.25f, 10.0f, 18.25f)
                curveTo(9.3096f, 18.25f, 8.75f, 17.6903f, 8.75f, 17.0f)
                curveTo(8.75f, 16.3096f, 9.3096f, 15.75f, 10.0f, 15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.2501f, 6.0149f)
                curveTo(8.25f, 6.0099f, 8.25f, 6.005f, 8.25f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(8.25f, 2.9289f, 9.9289f, 1.25f, 12.0f, 1.25f)
                curveTo(14.0711f, 1.25f, 15.75f, 2.9289f, 15.75f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(15.75f, 6.005f, 15.75f, 6.0099f, 15.7499f, 6.0149f)
                curveTo(17.0371f, 6.0535f, 17.8248f, 6.1924f, 18.4261f, 6.6915f)
                curveTo(19.2593f, 7.3829f, 19.4787f, 8.5534f, 19.9177f, 10.8943f)
                lineTo(20.6677f, 14.8943f)
                curveTo(21.2849f, 18.186f, 21.5934f, 19.8318f, 20.6937f, 20.9159f)
                curveTo(19.794f, 22.0f, 18.1195f, 22.0f, 14.7704f, 22.0f)
                horizontalLineTo(9.2295f)
                curveTo(5.8805f, 22.0f, 4.2059f, 22.0f, 3.3062f, 20.9159f)
                curveTo(2.4065f, 19.8318f, 2.7151f, 18.186f, 3.3323f, 14.8943f)
                lineTo(4.0823f, 10.8943f)
                curveTo(4.5212f, 8.5534f, 4.7407f, 7.3829f, 5.5739f, 6.6915f)
                curveTo(6.1752f, 6.1924f, 6.9629f, 6.0535f, 8.2501f, 6.0149f)
                close()
                moveTo(9.75f, 5.0f)
                curveTo(9.75f, 3.7574f, 10.7574f, 2.75f, 12.0f, 2.75f)
                curveTo(13.2426f, 2.75f, 14.25f, 3.7574f, 14.25f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(14.25f, 6.0f, 14.25f, 6.0f, 14.25f, 6.0f)
                curveTo(14.1747f, 6.0f, 14.0982f, 6.0f, 14.0204f, 6.0f)
                horizontalLineTo(9.9795f)
                curveTo(9.9018f, 6.0f, 9.8253f, 6.0f, 9.75f, 6.0f)
                curveTo(9.75f, 6.0f, 9.75f, 6.0f, 9.75f, 6.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(10.0f, 19.75f)
                curveTo(11.5188f, 19.75f, 12.75f, 18.5188f, 12.75f, 17.0f)
                verticalLineTo(14.1142f)
                curveTo(12.8974f, 14.1354f, 13.0493f, 14.138f, 13.2027f, 14.1201f)
                curveTo(13.4012f, 14.097f, 13.5801f, 14.0293f, 13.731f, 13.9635f)
                curveTo(13.8796f, 13.8987f, 14.0575f, 13.8098f, 14.2603f, 13.7083f)
                lineTo(15.6303f, 13.0234f)
                curveTo(15.7752f, 12.9512f, 15.9289f, 12.8746f, 16.0629f, 12.7721f)
                curveTo(16.4045f, 12.511f, 16.6379f, 12.1332f, 16.7188f, 11.7109f)
                curveTo(16.7505f, 11.5452f, 16.7503f, 11.3735f, 16.75f, 11.2116f)
                lineTo(16.75f, 11.1521f)
                curveTo(16.75f, 10.9253f, 16.75f, 10.7264f, 16.7415f, 10.5645f)
                curveTo(16.7328f, 10.4002f, 16.7134f, 10.2098f, 16.6454f, 10.022f)
                curveTo(16.3689f, 9.2586f, 15.6036f, 8.7857f, 14.7972f, 8.8798f)
                curveTo(14.5988f, 8.9029f, 14.4199f, 8.9707f, 14.269f, 9.0364f)
                curveTo(14.1204f, 9.1012f, 13.9425f, 9.1902f, 13.7397f, 9.2916f)
                lineTo(12.3697f, 9.9765f)
                curveTo(12.2248f, 10.0487f, 12.0711f, 10.1253f, 11.9371f, 10.2278f)
                curveTo(11.5955f, 10.4889f, 11.362f, 10.8667f, 11.2812f, 11.289f)
                curveTo(11.2495f, 11.4547f, 11.2498f, 11.6672f, 11.25f, 11.8291f)
                verticalLineTo(14.5498f)
                curveTo(10.875f, 14.3581f, 10.4501f, 14.25f, 10.0f, 14.25f)
                curveTo(8.4812f, 14.25f, 7.25f, 15.4812f, 7.25f, 17.0f)
                curveTo(7.25f, 18.5188f, 8.4812f, 19.75f, 10.0f, 19.75f)
                close()
            }
        }
            .build()
        return _bagMusic!!
    }

private var _bagMusic: ImageVector? = null
