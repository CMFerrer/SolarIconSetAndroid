package com.chiksmedina.solar.outline.astronomy

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
import com.chiksmedina.solar.outline.AstronomyGroup

public val AstronomyGroup.StarsMinimalistic: ImageVector
    get() {
        if (_starsMinimalistic != null) {
            return _starsMinimalistic!!
        }
        _starsMinimalistic = Builder(name = "StarsMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.4804f, 1.9031f)
                curveTo(5.4804f, 1.9031f, 5.4804f, 1.9031f, 5.4804f, 1.9031f)
                curveTo(5.4339f, 1.6684f, 5.2275f, 1.4992f, 4.9882f, 1.5f)
                curveTo(4.7488f, 1.5008f, 4.5436f, 1.6712f, 4.4987f, 1.9063f)
                lineTo(4.4984f, 1.908f)
                lineTo(4.4965f, 1.9176f)
                curveTo(4.4947f, 1.9266f, 4.4918f, 1.9406f, 4.4878f, 1.9591f)
                curveTo(4.4799f, 1.9961f, 4.4676f, 2.0509f, 4.4509f, 2.1192f)
                curveTo(4.4174f, 2.2562f, 4.3667f, 2.4448f, 4.2981f, 2.6507f)
                curveTo(4.1534f, 3.0848f, 3.9563f, 3.5108f, 3.73f, 3.7386f)
                curveTo(3.5037f, 3.9664f, 3.0792f, 4.1664f, 2.646f, 4.314f)
                curveTo(2.4406f, 4.384f, 2.2524f, 4.436f, 2.1155f, 4.4704f)
                curveTo(2.0474f, 4.4875f, 1.9926f, 4.5002f, 1.9557f, 4.5084f)
                curveTo(1.9372f, 4.5125f, 1.9232f, 4.5155f, 1.9143f, 4.5173f)
                lineTo(1.9047f, 4.5193f)
                lineTo(1.9031f, 4.5196f)
                curveTo(1.6683f, 4.5661f, 1.4992f, 4.7724f, 1.5f, 5.0118f)
                curveTo(1.5008f, 5.2512f, 1.6712f, 5.4564f, 1.9063f, 5.5013f)
                lineTo(1.908f, 5.5016f)
                lineTo(1.9176f, 5.5035f)
                curveTo(1.9266f, 5.5053f, 1.9406f, 5.5082f, 1.9591f, 5.5122f)
                curveTo(1.9961f, 5.5201f, 2.0509f, 5.5324f, 2.1192f, 5.5491f)
                curveTo(2.2562f, 5.5826f, 2.4448f, 5.6333f, 2.6507f, 5.7019f)
                curveTo(3.0848f, 5.8466f, 3.5108f, 6.0437f, 3.7386f, 6.27f)
                curveTo(3.9664f, 6.4963f, 4.1664f, 6.9208f, 4.314f, 7.354f)
                curveTo(4.384f, 7.5594f, 4.436f, 7.7477f, 4.4704f, 7.8845f)
                curveTo(4.4875f, 7.9526f, 4.5002f, 8.0074f, 4.5084f, 8.0443f)
                curveTo(4.5125f, 8.0628f, 4.5155f, 8.0768f, 4.5173f, 8.0857f)
                lineTo(4.5193f, 8.0953f)
                lineTo(4.5196f, 8.0969f)
                curveTo(4.5661f, 8.3317f, 4.7724f, 8.5008f, 5.0118f, 8.5f)
                curveTo(5.2512f, 8.4992f, 5.4564f, 8.3288f, 5.5013f, 8.0937f)
                lineTo(5.5016f, 8.092f)
                lineTo(5.5035f, 8.0824f)
                curveTo(5.5053f, 8.0735f, 5.5082f, 8.0594f, 5.5122f, 8.0409f)
                curveTo(5.5201f, 8.0039f, 5.5324f, 7.9491f, 5.5491f, 7.8808f)
                curveTo(5.5826f, 7.7438f, 5.6333f, 7.5552f, 5.7019f, 7.3493f)
                curveTo(5.8466f, 6.9152f, 6.0437f, 6.4892f, 6.27f, 6.2614f)
                curveTo(6.4963f, 6.0336f, 6.9208f, 5.8336f, 7.354f, 5.686f)
                curveTo(7.5594f, 5.616f, 7.7477f, 5.564f, 7.8845f, 5.5296f)
                curveTo(7.9526f, 5.5125f, 8.0074f, 5.4998f, 8.0443f, 5.4916f)
                curveTo(8.0628f, 5.4875f, 8.0768f, 5.4845f, 8.0857f, 5.4827f)
                lineTo(8.0953f, 5.4807f)
                lineTo(8.0969f, 5.4804f)
                curveTo(8.0968f, 5.4804f, 8.0969f, 5.4804f, 8.0969f, 5.4804f)
                curveTo(8.3316f, 5.4338f, 8.5008f, 5.2275f, 8.5f, 4.9882f)
                curveTo(8.4992f, 4.7488f, 8.3288f, 4.5436f, 8.0937f, 4.4987f)
                lineTo(8.092f, 4.4984f)
                lineTo(8.0824f, 4.4965f)
                curveTo(8.0735f, 4.4947f, 8.0594f, 4.4918f, 8.0409f, 4.4878f)
                curveTo(8.0039f, 4.4799f, 7.9491f, 4.4676f, 7.8808f, 4.4509f)
                curveTo(7.7438f, 4.4174f, 7.5552f, 4.3667f, 7.3493f, 4.2981f)
                curveTo(6.9152f, 4.1534f, 6.4892f, 3.9563f, 6.2614f, 3.73f)
                curveTo(6.0336f, 3.5037f, 5.8336f, 3.0792f, 5.686f, 2.646f)
                curveTo(5.616f, 2.4406f, 5.564f, 2.2524f, 5.5296f, 2.1155f)
                curveTo(5.5125f, 2.0474f, 5.4998f, 1.9926f, 5.4916f, 1.9557f)
                curveTo(5.4875f, 1.9372f, 5.4845f, 1.9232f, 5.4827f, 1.9143f)
                lineTo(5.4807f, 1.9047f)
                lineTo(5.4804f, 1.9031f)
                close()
                moveTo(6.3961f, 4.9953f)
                curveTo(6.0933f, 4.853f, 5.7892f, 4.6704f, 5.5567f, 4.4395f)
                curveTo(5.3243f, 4.2086f, 5.1396f, 3.9057f, 4.9953f, 3.6039f)
                curveTo(4.853f, 3.9067f, 4.6704f, 4.2108f, 4.4395f, 4.4433f)
                curveTo(4.2086f, 4.6757f, 3.9057f, 4.8604f, 3.6039f, 5.0047f)
                curveTo(3.9067f, 5.147f, 4.2108f, 5.3296f, 4.4433f, 5.5605f)
                curveTo(4.6757f, 5.7914f, 4.8604f, 6.0943f, 5.0047f, 6.3961f)
                curveTo(5.147f, 6.0933f, 5.3296f, 5.7892f, 5.5605f, 5.5567f)
                curveTo(5.7914f, 5.3243f, 6.0943f, 5.1396f, 6.3961f, 4.9953f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 3.25f)
                curveTo(19.4142f, 3.25f, 19.75f, 3.5858f, 19.75f, 4.0f)
                verticalLineTo(4.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 4.25f, 20.75f, 4.5858f, 20.75f, 5.0f)
                curveTo(20.75f, 5.4142f, 20.4142f, 5.75f, 20.0f, 5.75f)
                horizontalLineTo(19.75f)
                verticalLineTo(6.0f)
                curveTo(19.75f, 6.4142f, 19.4142f, 6.75f, 19.0f, 6.75f)
                curveTo(18.5858f, 6.75f, 18.25f, 6.4142f, 18.25f, 6.0f)
                verticalLineTo(5.75f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 5.75f, 17.25f, 5.4142f, 17.25f, 5.0f)
                curveTo(17.25f, 4.5858f, 17.5858f, 4.25f, 18.0f, 4.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(4.0f)
                curveTo(18.25f, 3.5858f, 18.5858f, 3.25f, 19.0f, 3.25f)
                close()
                moveTo(11.9875f, 6.1803f)
                curveTo(11.659f, 6.6092f, 11.2858f, 7.2747f, 10.7353f, 8.2623f)
                lineTo(10.4567f, 8.762f)
                curveTo(10.4388f, 8.7942f, 10.421f, 8.8263f, 10.4033f, 8.8581f)
                curveTo(10.1521f, 9.3106f, 9.925f, 9.7197f, 9.5577f, 9.9985f)
                curveTo(9.1859f, 10.2807f, 8.7337f, 10.3821f, 8.2439f, 10.492f)
                curveTo(8.2094f, 10.4997f, 8.1748f, 10.5075f, 8.14f, 10.5154f)
                lineTo(7.5991f, 10.6377f)
                curveTo(6.5283f, 10.88f, 5.8126f, 11.0441f, 5.3254f, 11.2361f)
                curveTo(4.8524f, 11.4226f, 4.789f, 11.5612f, 4.765f, 11.6383f)
                curveTo(4.7385f, 11.7236f, 4.7165f, 11.8899f, 5.0004f, 12.3408f)
                curveTo(5.2893f, 12.7998f, 5.7793f, 13.3758f, 6.5081f, 14.228f)
                lineTo(6.8768f, 14.6592f)
                curveTo(6.8998f, 14.6861f, 6.9227f, 14.7128f, 6.9455f, 14.7393f)
                curveTo(7.2827f, 15.1323f, 7.5834f, 15.4829f, 7.7217f, 15.9274f)
                curveTo(7.8589f, 16.3688f, 7.8134f, 16.8314f, 7.7617f, 17.3562f)
                curveTo(7.7582f, 17.3916f, 7.7547f, 17.4273f, 7.7512f, 17.4633f)
                lineTo(7.6955f, 18.0386f)
                curveTo(7.5854f, 19.1745f, 7.5126f, 19.9446f, 7.5372f, 20.4964f)
                curveTo(7.5617f, 21.0469f, 7.6771f, 21.1584f, 7.7304f, 21.1988f)
                curveTo(7.7714f, 21.23f, 7.8816f, 21.3108f, 8.3741f, 21.1697f)
                curveTo(8.8763f, 21.0258f, 9.5479f, 20.7189f, 10.5507f, 20.2572f)
                lineTo(11.0571f, 20.0241f)
                curveTo(11.0903f, 20.0087f, 11.1234f, 19.9934f, 11.1563f, 19.9782f)
                curveTo(11.6116f, 19.7675f, 12.0358f, 19.5711f, 12.5f, 19.5711f)
                curveTo(12.9642f, 19.5711f, 13.3884f, 19.7675f, 13.8437f, 19.9782f)
                curveTo(13.8766f, 19.9934f, 13.9097f, 20.0087f, 13.9429f, 20.0241f)
                lineTo(14.4494f, 20.2572f)
                curveTo(15.452f, 20.7189f, 16.1238f, 21.0258f, 16.6259f, 21.1697f)
                curveTo(17.1184f, 21.3108f, 17.2286f, 21.23f, 17.2696f, 21.1988f)
                curveTo(17.3229f, 21.1584f, 17.4383f, 21.0469f, 17.4628f, 20.4964f)
                curveTo(17.4874f, 19.9446f, 17.4146f, 19.1745f, 17.3045f, 18.0386f)
                lineTo(17.2488f, 17.4633f)
                curveTo(17.2453f, 17.4273f, 17.2418f, 17.3916f, 17.2383f, 17.3562f)
                curveTo(17.1866f, 16.8314f, 17.1411f, 16.3688f, 17.2783f, 15.9274f)
                curveTo(17.4166f, 15.4829f, 17.7173f, 15.1323f, 18.0545f, 14.7393f)
                curveTo(18.0773f, 14.7128f, 18.1001f, 14.6861f, 18.1232f, 14.6592f)
                lineTo(18.4919f, 14.228f)
                curveTo(19.2207f, 13.3758f, 19.7107f, 12.7998f, 19.9996f, 12.3408f)
                curveTo(20.2835f, 11.8899f, 20.2615f, 11.7236f, 20.235f, 11.6383f)
                curveTo(20.211f, 11.5612f, 20.1476f, 11.4226f, 19.6746f, 11.2361f)
                curveTo(19.1874f, 11.0441f, 18.4717f, 10.88f, 17.4009f, 10.6377f)
                lineTo(16.86f, 10.5153f)
                curveTo(16.8252f, 10.5075f, 16.7905f, 10.4997f, 16.7561f, 10.492f)
                curveTo(16.2663f, 10.3821f, 15.8141f, 10.2807f, 15.4423f, 9.9985f)
                curveTo(15.075f, 9.7197f, 14.8479f, 9.3106f, 14.5967f, 8.8581f)
                curveTo(14.579f, 8.8263f, 14.5612f, 8.7942f, 14.5433f, 8.762f)
                lineTo(14.2647f, 8.2623f)
                curveTo(13.7142f, 7.2747f, 13.341f, 6.6092f, 13.0125f, 6.1803f)
                curveTo(12.6844f, 5.7518f, 12.5427f, 5.75f, 12.5f, 5.75f)
                curveTo(12.4573f, 5.75f, 12.3156f, 5.7518f, 11.9875f, 6.1803f)
                close()
                moveTo(10.7966f, 5.2683f)
                curveTo(11.208f, 4.731f, 11.7379f, 4.25f, 12.5f, 4.25f)
                curveTo(13.2621f, 4.25f, 13.792f, 4.731f, 14.2034f, 5.2683f)
                curveTo(14.6066f, 5.7948f, 15.0321f, 6.5582f, 15.5447f, 7.4778f)
                lineTo(15.8534f, 8.0316f)
                curveTo(16.192f, 8.6389f, 16.2654f, 8.7401f, 16.3493f, 8.8038f)
                curveTo(16.4284f, 8.8638f, 16.5324f, 8.9033f, 17.191f, 9.0523f)
                lineTo(17.794f, 9.1888f)
                curveTo(18.7864f, 9.4133f, 19.6168f, 9.6011f, 20.2245f, 9.8406f)
                curveTo(20.859f, 10.0906f, 21.4426f, 10.4702f, 21.6674f, 11.1929f)
                curveTo(21.8895f, 11.9073f, 21.6357f, 12.5575f, 21.269f, 13.14f)
                curveTo(20.9144f, 13.7033f, 20.3505f, 14.3627f, 19.6716f, 15.1565f)
                lineTo(19.2632f, 15.6341f)
                curveTo(18.8176f, 16.1551f, 18.7454f, 16.2612f, 18.7107f, 16.3728f)
                curveTo(18.675f, 16.4875f, 18.6745f, 16.6241f, 18.7418f, 17.3186f)
                lineTo(18.8033f, 17.9537f)
                curveTo(18.9062f, 19.0147f, 18.9912f, 19.892f, 18.9613f, 20.5631f)
                curveTo(18.9308f, 21.2481f, 18.7744f, 21.9397f, 18.1766f, 22.3936f)
                curveTo(17.5665f, 22.8567f, 16.8618f, 22.7977f, 16.2127f, 22.6117f)
                curveTo(15.5864f, 22.4322f, 14.8093f, 22.0744f, 13.8803f, 21.6466f)
                lineTo(13.3156f, 21.3866f)
                curveTo(12.6964f, 21.1015f, 12.5919f, 21.0711f, 12.5f, 21.0711f)
                curveTo(12.4081f, 21.0711f, 12.3036f, 21.1015f, 11.6844f, 21.3866f)
                lineTo(11.1197f, 21.6466f)
                curveTo(10.1907f, 22.0744f, 9.4136f, 22.4322f, 8.7873f, 22.6117f)
                curveTo(8.1382f, 22.7977f, 7.4335f, 22.8567f, 6.8234f, 22.3936f)
                curveTo(6.2256f, 21.9397f, 6.0692f, 21.2481f, 6.0387f, 20.5631f)
                curveTo(6.0088f, 19.892f, 6.0938f, 19.0147f, 6.1967f, 17.9538f)
                lineTo(6.2582f, 17.3186f)
                curveTo(6.3255f, 16.6241f, 6.325f, 16.4875f, 6.2893f, 16.3728f)
                curveTo(6.2546f, 16.2612f, 6.1824f, 16.1551f, 5.7368f, 15.6341f)
                lineTo(5.3284f, 15.1565f)
                curveTo(4.6495f, 14.3627f, 4.0856f, 13.7033f, 3.731f, 13.14f)
                curveTo(3.3643f, 12.5575f, 3.1105f, 11.9073f, 3.3326f, 11.1929f)
                curveTo(3.5574f, 10.4702f, 4.141f, 10.0906f, 4.7755f, 9.8406f)
                curveTo(5.3832f, 9.6011f, 6.2136f, 9.4133f, 7.206f, 9.1888f)
                lineTo(7.809f, 9.0523f)
                curveTo(8.4676f, 8.9033f, 8.5716f, 8.8638f, 8.6507f, 8.8038f)
                curveTo(8.7346f, 8.7401f, 8.808f, 8.6389f, 9.1466f, 8.0316f)
                lineTo(9.4553f, 7.4778f)
                curveTo(9.9679f, 6.5582f, 10.3934f, 5.7948f, 10.7966f, 5.2683f)
                close()
            }
        }
        .build()
        return _starsMinimalistic!!
    }

private var _starsMinimalistic: ImageVector? = null