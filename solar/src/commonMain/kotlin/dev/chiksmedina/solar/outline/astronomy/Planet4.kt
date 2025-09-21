package dev.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Planet4: ImageVector
    get() {
        if (_planet4 != null) {
            return _planet4!!
        }
        _planet4 = Builder(
            name = "Planet4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 5.2499f)
                curveTo(5.1675f, 5.2499f, 1.25f, 9.1674f, 1.25f, 13.9999f)
                curveTo(1.25f, 18.8324f, 5.1675f, 22.7499f, 10.0f, 22.7499f)
                curveTo(14.8325f, 22.7499f, 18.75f, 18.8324f, 18.75f, 13.9999f)
                curveTo(18.75f, 9.1674f, 14.8325f, 5.2499f, 10.0f, 5.2499f)
                close()
                moveTo(4.0131f, 16.7809f)
                curveTo(3.7032f, 16.7573f, 3.457f, 16.7507f, 3.2898f, 16.75f)
                curveTo(4.373f, 19.3903f, 6.9693f, 21.2499f, 10.0f, 21.2499f)
                curveTo(12.5605f, 21.2499f, 14.8109f, 19.9226f, 16.1008f, 17.9185f)
                curveTo(14.9908f, 18.3628f, 13.5326f, 18.7499f, 11.8193f, 18.7499f)
                curveTo(10.4152f, 18.7499f, 9.3368f, 18.4231f, 8.4708f, 18.0618f)
                curveTo(8.1376f, 17.9228f, 7.8284f, 17.7751f, 7.5592f, 17.6466f)
                curveTo(7.4874f, 17.6123f, 7.4185f, 17.5794f, 7.3527f, 17.5483f)
                curveTo(7.0244f, 17.3935f, 6.7768f, 17.2867f, 6.5592f, 17.2271f)
                curveTo(5.5352f, 16.9468f, 4.6443f, 16.8288f, 4.0131f, 16.7809f)
                close()
                moveTo(2.75f, 13.9999f)
                curveTo(2.75f, 13.2953f, 2.8505f, 12.6142f, 3.038f, 11.9701f)
                curveTo(3.3297f, 12.1697f, 3.7375f, 12.4227f, 4.2473f, 12.6748f)
                curveTo(5.3307f, 13.2104f, 6.891f, 13.7499f, 8.7845f, 13.7499f)
                curveTo(10.1104f, 13.7499f, 11.1281f, 13.4182f, 11.9413f, 13.0541f)
                curveTo(12.2537f, 12.9141f, 12.544f, 12.7653f, 12.7949f, 12.6367f)
                curveTo(12.8615f, 12.6026f, 12.9253f, 12.5699f, 12.9861f, 12.5391f)
                curveTo(13.2923f, 12.3841f, 13.5171f, 12.2804f, 13.7114f, 12.2233f)
                curveTo(14.6584f, 11.945f, 15.4818f, 11.828f, 16.0643f, 11.7805f)
                curveTo(16.3552f, 11.7568f, 16.5849f, 11.7505f, 16.7384f, 11.7499f)
                curveTo(16.8055f, 11.7497f, 16.858f, 11.7505f, 16.8946f, 11.7515f)
                curveTo(17.1253f, 12.4593f, 17.25f, 13.215f, 17.25f, 13.9999f)
                curveTo(17.25f, 14.6633f, 17.1609f, 15.3059f, 16.994f, 15.9164f)
                curveTo(16.8737f, 15.9173f, 16.7518f, 15.9472f, 16.639f, 16.0092f)
                curveTo(15.6547f, 16.5497f, 13.9641f, 17.2499f, 11.8193f, 17.2499f)
                curveTo(10.6661f, 17.2499f, 9.7872f, 16.9857f, 9.0484f, 16.6774f)
                curveTo(8.7535f, 16.5544f, 8.4884f, 16.4279f, 8.2235f, 16.3014f)
                curveTo(8.1468f, 16.2648f, 8.0701f, 16.2282f, 7.9926f, 16.1917f)
                curveTo(7.6638f, 16.0366f, 7.3114f, 15.8778f, 6.9552f, 15.7803f)
                curveTo(5.8227f, 15.4703f, 4.835f, 15.339f, 4.1267f, 15.2852f)
                curveTo(3.7722f, 15.2582f, 3.4866f, 15.2506f, 3.2864f, 15.2499f)
                curveTo(3.1863f, 15.2496f, 3.1074f, 15.251f, 3.0519f, 15.2525f)
                curveTo(3.0241f, 15.2533f, 3.0021f, 15.2542f, 2.9863f, 15.2548f)
                lineTo(2.9671f, 15.2557f)
                lineTo(2.9609f, 15.256f)
                lineTo(2.9587f, 15.2562f)
                lineTo(2.9571f, 15.2563f)
                curveTo(2.9243f, 15.2581f, 2.892f, 15.2621f, 2.8605f, 15.268f)
                curveTo(2.7879f, 14.8563f, 2.75f, 14.4325f, 2.75f, 13.9999f)
                close()
                moveTo(3.6247f, 10.5447f)
                curveTo(3.68f, 10.5868f, 3.752f, 10.6399f, 3.8399f, 10.701f)
                curveTo(4.0831f, 10.8702f, 4.446f, 11.0997f, 4.9121f, 11.3301f)
                curveTo(5.846f, 11.7919f, 7.1779f, 12.2499f, 8.7845f, 12.2499f)
                curveTo(9.8407f, 12.2499f, 10.6463f, 11.9905f, 11.3282f, 11.6851f)
                curveTo(11.6009f, 11.5629f, 11.8456f, 11.4376f, 12.0921f, 11.3113f)
                curveTo(12.1638f, 11.2746f, 12.2357f, 11.2377f, 12.3084f, 11.2009f)
                curveTo(12.6144f, 11.046f, 12.9485f, 10.8841f, 13.2886f, 10.7841f)
                curveTo(14.3505f, 10.4721f, 15.2771f, 10.3398f, 15.9424f, 10.2855f)
                curveTo(16.0392f, 10.2776f, 16.1305f, 10.2713f, 16.2161f, 10.2664f)
                curveTo(14.9478f, 8.1594f, 12.6385f, 6.7499f, 10.0f, 6.7499f)
                curveTo(7.247f, 6.7499f, 4.8524f, 8.2844f, 3.6247f, 10.5447f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.5301f, 4.0447f)
                curveTo(20.4935f, 3.9506f, 20.4492f, 3.8581f, 20.3972f, 3.7679f)
                curveTo(20.3451f, 3.6778f, 20.2871f, 3.5932f, 20.2239f, 3.5144f)
                curveTo(20.5503f, 3.4237f, 20.7725f, 3.418f, 20.8302f, 3.5179f)
                curveTo(20.8879f, 3.6178f, 20.7719f, 3.8074f, 20.5301f, 4.0447f)
                close()
                moveTo(17.1063f, 6.0214f)
                curveTo(16.78f, 6.1122f, 16.5577f, 6.1178f, 16.5001f, 6.0179f)
                curveTo(16.4424f, 5.918f, 16.5584f, 5.7284f, 16.8002f, 5.4911f)
                curveTo(16.8368f, 5.5852f, 16.881f, 5.6778f, 16.9331f, 5.7679f)
                curveTo(16.9851f, 5.8581f, 17.0431f, 5.9426f, 17.1063f, 6.0214f)
                close()
                moveTo(17.1063f, 6.0214f)
                curveTo(17.5613f, 5.8949f, 18.2188f, 5.6029f, 18.9151f, 5.2009f)
                curveTo(19.6114f, 4.7989f, 20.193f, 4.3755f, 20.5301f, 4.0447f)
                curveTo(20.8821f, 4.9491f, 20.5316f, 5.9997f, 19.6651f, 6.5f)
                curveTo(18.7987f, 7.0002f, 17.7136f, 6.7785f, 17.1063f, 6.0214f)
                close()
                moveTo(16.8002f, 5.4911f)
                curveTo(16.4482f, 4.5867f, 16.7987f, 3.5361f, 17.6651f, 3.0359f)
                curveTo(18.5316f, 2.5356f, 19.6167f, 2.7574f, 20.2239f, 3.5144f)
                curveTo(19.7689f, 3.6409f, 19.1114f, 3.9329f, 18.4151f, 4.3349f)
                curveTo(17.7188f, 4.7369f, 17.1373f, 5.1603f, 16.8002f, 5.4911f)
                close()
            }
        }
            .build()
        return _planet4!!
    }

private var _planet4: ImageVector? = null
