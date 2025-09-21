package dev.chiksmedina.solar.bold.astronomy

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
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.StarRing: ImageVector
    get() {
        if (_starRing != null) {
            return _starRing!!
        }
        _starRing = Builder(
            name = "StarRing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.2733f, 19.4499f)
                curveTo(16.9027f, 19.6961f, 17.4879f, 19.8839f, 18.0206f, 20.0155f)
                lineTo(18.028f, 20.0173f)
                curveTo(18.9815f, 20.2521f, 19.739f, 20.2995f, 20.2774f, 20.2031f)
                curveTo(20.4294f, 20.1758f, 20.5575f, 20.1389f, 20.6655f, 20.0943f)
                curveTo(20.929f, 19.9837f, 21.0738f, 19.8265f, 21.1502f, 19.6637f)
                curveTo(21.2379f, 19.4768f, 21.2785f, 19.2057f, 21.2276f, 18.837f)
                curveTo(21.2002f, 18.6392f, 21.1464f, 18.4129f, 21.0592f, 18.1559f)
                curveTo(21.0459f, 18.1167f, 21.0319f, 18.0772f, 21.0173f, 18.0372f)
                curveTo(20.8989f, 17.7141f, 20.7363f, 17.3647f, 20.5303f, 16.9936f)
                lineTo(20.5192f, 16.9738f)
                curveTo(20.4896f, 16.9207f, 20.4591f, 16.8672f, 20.4277f, 16.8133f)
                curveTo(20.1531f, 16.3411f, 19.8116f, 15.8373f, 19.4059f, 15.3108f)
                lineTo(19.4016f, 15.3051f)
                curveTo(18.005f, 13.4939f, 15.9115f, 11.4961f, 13.3966f, 9.7096f)
                curveTo(10.7308f, 7.8159f, 8.1504f, 6.5566f, 6.1528f, 6.0289f)
                curveTo(6.0954f, 6.0137f, 6.0387f, 5.9992f, 5.9826f, 5.9853f)
                lineTo(5.9721f, 5.9828f)
                curveTo(5.0185f, 5.748f, 4.261f, 5.7006f, 3.7226f, 5.797f)
                curveTo(3.5071f, 5.8356f, 3.3398f, 5.8937f, 3.2098f, 5.9654f)
                curveTo(3.0246f, 6.0676f, 2.9151f, 6.1972f, 2.8498f, 6.3363f)
                curveTo(2.7373f, 6.576f, 2.7083f, 6.9437f, 2.8259f, 7.4471f)
                curveTo(2.8628f, 7.6044f, 2.9143f, 7.7761f, 2.9827f, 7.9628f)
                curveTo(3.0586f, 8.17f, 3.1526f, 8.3876f, 3.2643f, 8.6145f)
                curveTo(3.2802f, 8.6469f, 3.2966f, 8.6797f, 3.3134f, 8.7127f)
                lineTo(3.3426f, 8.7696f)
                curveTo(3.3767f, 8.8354f, 3.4122f, 8.9019f, 3.449f, 8.9689f)
                curveTo(3.7423f, 9.5028f, 4.1253f, 10.081f, 4.5941f, 10.6894f)
                lineTo(4.5969f, 10.6931f)
                curveTo(5.1008f, 11.3467f, 5.6987f, 12.0288f, 6.3802f, 12.7207f)
                curveTo(6.535f, 12.8778f, 6.6787f, 13.0224f, 6.8123f, 13.1555f)
                lineTo(6.8363f, 12.8473f)
                curveTo(6.9367f, 11.5612f, 6.9869f, 10.9181f, 7.423f, 10.6889f)
                curveTo(7.8591f, 10.4597f, 8.3923f, 10.7961f, 9.4587f, 11.469f)
                lineTo(9.7346f, 11.6431f)
                curveTo(10.0377f, 11.8343f, 10.1892f, 11.9299f, 10.3637f, 11.9538f)
                curveTo(10.5382f, 11.9777f, 10.716f, 11.9272f, 11.0715f, 11.8261f)
                lineTo(11.3952f, 11.7342f)
                curveTo(12.6464f, 11.3786f, 13.272f, 11.2009f, 13.6068f, 11.5356f)
                curveTo(13.9416f, 11.8704f, 13.7638f, 12.496f, 13.4083f, 13.7472f)
                lineTo(13.3163f, 14.0709f)
                curveTo(13.2152f, 14.4264f, 13.1647f, 14.6042f, 13.1886f, 14.7787f)
                curveTo(13.2125f, 14.9532f, 13.3081f, 15.1048f, 13.4993f, 15.4078f)
                lineTo(13.6734f, 15.6837f)
                curveTo(14.3463f, 16.7501f, 14.6827f, 17.2833f, 14.4535f, 17.7194f)
                curveTo(14.2243f, 18.1555f, 13.5812f, 18.2057f, 12.2951f, 18.3061f)
                lineTo(11.9624f, 18.3321f)
                curveTo(11.5969f, 18.3606f, 11.4142f, 18.3749f, 11.2544f, 18.4589f)
                curveTo(11.0946f, 18.5428f, 10.976f, 18.687f, 10.7386f, 18.9753f)
                lineTo(10.5225f, 19.2378f)
                curveTo(9.6871f, 20.2524f, 9.2695f, 20.7597f, 8.793f, 20.6944f)
                curveTo(8.3166f, 20.6292f, 8.0969f, 20.0346f, 7.6576f, 18.8455f)
                lineTo(7.544f, 18.5379f)
                curveTo(7.4191f, 18.2f, 7.3567f, 18.031f, 7.234f, 17.9084f)
                curveTo(7.1114f, 17.7857f, 6.9425f, 17.7233f, 6.6045f, 17.5985f)
                lineTo(6.2969f, 17.4848f)
                curveTo(5.1078f, 17.0455f, 4.5132f, 16.8258f, 4.448f, 16.3494f)
                curveTo(4.3827f, 15.873f, 4.89f, 15.4553f, 5.9046f, 14.62f)
                lineTo(6.0438f, 14.5053f)
                curveTo(5.8287f, 14.2942f, 5.5858f, 14.0516f, 5.3116f, 13.7733f)
                curveTo(4.4798f, 12.9289f, 3.748f, 12.08f, 3.1435f, 11.256f)
                curveTo(3.0211f, 11.0893f, 2.9039f, 10.9235f, 2.7922f, 10.7591f)
                curveTo(2.6732f, 10.5839f, 2.5604f, 10.4101f, 2.454f, 10.2381f)
                curveTo(2.3986f, 10.1485f, 2.3449f, 10.0594f, 2.293f, 9.9708f)
                curveTo(2.192f, 9.7983f, 2.0978f, 9.6277f, 2.0107f, 9.4595f)
                curveTo(1.9776f, 9.3956f, 1.9453f, 9.3316f, 1.9138f, 9.2674f)
                curveTo(1.7821f, 8.9991f, 1.6684f, 8.7358f, 1.5743f, 8.4789f)
                curveTo(1.4913f, 8.2523f, 1.4209f, 8.0236f, 1.3672f, 7.7954f)
                curveTo(1.1911f, 7.0491f, 1.197f, 6.3276f, 1.4919f, 5.6991f)
                curveTo(1.7399f, 5.1706f, 2.1447f, 4.8081f, 2.631f, 4.5784f)
                curveTo(2.9112f, 4.4459f, 3.2186f, 4.3576f, 3.5386f, 4.3069f)
                curveTo(4.3988f, 4.1706f, 5.4298f, 4.2864f, 6.536f, 4.5786f)
                curveTo(8.7585f, 5.1658f, 11.5025f, 6.5242f, 14.2652f, 8.4867f)
                curveTo(17.031f, 10.4515f, 19.3455f, 12.6877f, 20.8493f, 14.7341f)
                curveTo(21.3469f, 15.4113f, 21.7645f, 16.0795f, 22.0802f, 16.7204f)
                curveTo(22.1811f, 16.9252f, 22.2716f, 17.1273f, 22.3509f, 17.3259f)
                curveTo(22.3977f, 17.4431f, 22.4407f, 17.5591f, 22.4796f, 17.6738f)
                curveTo(22.7858f, 18.576f, 22.8797f, 19.5091f, 22.5081f, 20.3009f)
                curveTo(22.2358f, 20.8812f, 21.7817f, 21.2568f, 21.2374f, 21.4799f)
                curveTo(21.0179f, 21.5706f, 20.7838f, 21.6362f, 20.5417f, 21.6796f)
                curveTo(20.3358f, 21.7165f, 20.1197f, 21.7384f, 19.8951f, 21.7464f)
                curveTo(19.8603f, 21.7477f, 19.8254f, 21.7486f, 19.7905f, 21.7492f)
                curveTo(19.6446f, 21.7517f, 19.4946f, 21.7485f, 19.3407f, 21.7398f)
                curveTo(19.0403f, 21.723f, 18.7253f, 21.6852f, 18.3981f, 21.6281f)
                curveTo(17.5736f, 21.484f, 16.6712f, 21.2163f, 15.7267f, 20.8467f)
                curveTo(15.341f, 20.6958f, 15.1506f, 20.2608f, 15.3016f, 19.875f)
                curveTo(15.4525f, 19.4893f, 15.8875f, 19.2989f, 16.2733f, 19.4499f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.6653f, 2.4089f)
                curveTo(19.9918f, 2.6638f, 20.0498f, 3.1351f, 19.7949f, 3.4616f)
                lineTo(19.6836f, 3.6042f)
                curveTo(19.8074f, 4.2622f, 20.1092f, 4.871f, 20.5544f, 5.3595f)
                curveTo(20.8334f, 5.6657f, 20.8113f, 6.14f, 20.5052f, 6.419f)
                curveTo(20.199f, 6.698f, 19.7246f, 6.676f, 19.4456f, 6.3698f)
                curveTo(18.9952f, 5.8755f, 18.6498f, 5.2976f, 18.4247f, 4.6725f)
                curveTo(18.3203f, 4.7349f, 18.2146f, 4.7917f, 18.105f, 4.8435f)
                curveTo(17.9852f, 4.9001f, 17.8639f, 4.9492f, 17.7385f, 4.993f)
                curveTo(18.0635f, 5.5843f, 18.2703f, 6.2396f, 18.343f, 6.9205f)
                curveTo(18.3869f, 7.3324f, 18.0886f, 7.7019f, 17.6767f, 7.7458f)
                curveTo(17.2648f, 7.7897f, 16.8953f, 7.4914f, 16.8514f, 7.0796f)
                curveTo(16.7805f, 6.4147f, 16.5297f, 5.788f, 16.1329f, 5.2688f)
                lineTo(15.9748f, 5.2634f)
                curveTo(15.5608f, 5.2495f, 15.2365f, 4.9026f, 15.2504f, 4.4886f)
                curveTo(15.2644f, 4.0746f, 15.6112f, 3.7503f, 16.0252f, 3.7643f)
                lineTo(16.4325f, 3.778f)
                curveTo(16.9586f, 3.6741f, 17.2301f, 3.5979f, 17.4642f, 3.4873f)
                curveTo(17.6993f, 3.3762f, 17.9338f, 3.2128f, 18.3552f, 2.8681f)
                lineTo(18.6126f, 2.5385f)
                curveTo(18.8675f, 2.212f, 19.3388f, 2.154f, 19.6653f, 2.4089f)
                close()
            }
        }
            .build()
        return _starRing!!
    }

private var _starRing: ImageVector? = null
