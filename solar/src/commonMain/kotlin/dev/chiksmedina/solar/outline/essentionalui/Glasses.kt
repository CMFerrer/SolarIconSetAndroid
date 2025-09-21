package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = Builder(
            name = "Glasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.2372f, 4.7115f)
                curveTo(6.6301f, 4.5806f, 6.8425f, 4.1558f, 6.7115f, 3.7629f)
                curveTo(6.5805f, 3.3699f, 6.1558f, 3.1575f, 5.7628f, 3.2885f)
                lineTo(5.208f, 3.4734f)
                curveTo(4.6371f, 3.6637f, 4.1532f, 3.825f, 3.7691f, 4.0006f)
                curveTo(3.3603f, 4.1874f, 3.0024f, 4.4167f, 2.7176f, 4.7764f)
                curveTo(2.4327f, 5.136f, 2.2915f, 5.5368f, 2.2033f, 5.9776f)
                curveTo(2.1203f, 6.3917f, 2.0742f, 6.8997f, 2.0197f, 7.499f)
                lineTo(1.3225f, 15.1689f)
                curveTo(1.2753f, 15.4362f, 1.2505f, 15.7113f, 1.25f, 15.992f)
                curveTo(1.2554f, 18.6107f, 3.38f, 20.75f, 6.0f, 20.75f)
                curveTo(8.3632f, 20.75f, 10.3234f, 19.0242f, 10.6889f, 16.7641f)
                lineTo(10.9079f, 16.6859f)
                curveTo(11.6142f, 16.434f, 12.3858f, 16.434f, 13.0921f, 16.686f)
                lineTo(13.3111f, 16.7641f)
                curveTo(13.6766f, 19.0242f, 15.6367f, 20.75f, 18.0f, 20.75f)
                curveTo(20.62f, 20.75f, 22.7445f, 18.6107f, 22.75f, 15.992f)
                curveTo(22.7495f, 15.7112f, 22.7247f, 15.4362f, 22.6775f, 15.1689f)
                lineTo(21.9803f, 7.499f)
                curveTo(21.9258f, 6.8997f, 21.8796f, 6.3917f, 21.7967f, 5.9776f)
                curveTo(21.7084f, 5.5368f, 21.5672f, 5.136f, 21.2824f, 4.7764f)
                curveTo(20.9975f, 4.4167f, 20.6397f, 4.1874f, 20.2309f, 4.0006f)
                curveTo(19.8468f, 3.825f, 19.3629f, 3.6637f, 18.792f, 3.4734f)
                lineTo(18.2372f, 3.2885f)
                curveTo(17.8442f, 3.1575f, 17.4195f, 3.3699f, 17.2885f, 3.7629f)
                curveTo(17.1575f, 4.1558f, 17.3699f, 4.5806f, 17.7628f, 4.7115f)
                lineTo(18.281f, 4.8843f)
                curveTo(18.8984f, 5.09f, 19.3051f, 5.2267f, 19.6073f, 5.3648f)
                curveTo(19.8931f, 5.4955f, 20.0214f, 5.6001f, 20.1065f, 5.7077f)
                curveTo(20.1917f, 5.8152f, 20.2642f, 5.964f, 20.3259f, 6.2721f)
                curveTo(20.3912f, 6.598f, 20.431f, 7.0252f, 20.4899f, 7.6732f)
                lineTo(20.9052f, 12.2418f)
                curveTo(20.1021f, 11.62f, 19.0943f, 11.25f, 18.0f, 11.25f)
                curveTo(15.6549f, 11.25f, 13.7067f, 12.9495f, 13.3198f, 15.184f)
                curveTo(12.4577f, 14.9346f, 11.5423f, 14.9346f, 10.6802f, 15.184f)
                curveTo(10.2933f, 12.9495f, 8.3451f, 11.25f, 6.0f, 11.25f)
                curveTo(4.9057f, 11.25f, 3.8979f, 11.62f, 3.0947f, 12.2418f)
                lineTo(3.1431f, 11.71f)
                lineTo(3.5101f, 7.6732f)
                curveTo(3.569f, 7.0252f, 3.6088f, 6.598f, 3.6741f, 6.2721f)
                curveTo(3.7358f, 5.964f, 3.8083f, 5.8152f, 3.8935f, 5.7077f)
                curveTo(3.9786f, 5.6001f, 4.1068f, 5.4955f, 4.3926f, 5.3648f)
                curveTo(4.6949f, 5.2267f, 5.1016f, 5.09f, 5.719f, 4.8843f)
                lineTo(6.2372f, 4.7115f)
                close()
                moveTo(21.1902f, 15.3762f)
                lineTo(21.2498f, 16.0323f)
                curveTo(21.2325f, 17.8124f, 19.7841f, 19.25f, 18.0f, 19.25f)
                curveTo(16.2051f, 19.25f, 14.75f, 17.7949f, 14.75f, 16.0f)
                curveTo(14.75f, 14.2051f, 16.2051f, 12.75f, 18.0f, 12.75f)
                curveTo(19.5816f, 12.75f, 20.8993f, 13.8797f, 21.1902f, 15.3762f)
                close()
                moveTo(2.8098f, 15.3762f)
                lineTo(2.7501f, 16.0323f)
                curveTo(2.7675f, 17.8124f, 4.2158f, 19.25f, 6.0f, 19.25f)
                curveTo(7.7949f, 19.25f, 9.25f, 17.7949f, 9.25f, 16.0f)
                curveTo(9.25f, 14.2051f, 7.7949f, 12.75f, 6.0f, 12.75f)
                curveTo(4.4184f, 12.75f, 3.1007f, 13.8797f, 2.8098f, 15.3762f)
                close()
            }
        }
            .build()
        return _glasses!!
    }

private var _glasses: ImageVector? = null
