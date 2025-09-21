package dev.chiksmedina.solar.boldduotone.videoaudiosound

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
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.VolumeLoud: ImageVector
    get() {
        if (_volumeLoud != null) {
            return _volumeLoud!!
        }
        _volumeLoud = Builder(
            name = "VolumeLoud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.003f, 11.7155f)
                curveTo(2.0403f, 9.8733f, 2.059f, 8.9522f, 2.6709f, 8.1636f)
                curveTo(2.7826f, 8.0197f, 2.9465f, 7.8487f, 3.0838f, 7.7327f)
                curveTo(3.8364f, 7.0974f, 4.8299f, 7.0974f, 6.8171f, 7.0974f)
                curveTo(7.527f, 7.0974f, 7.882f, 7.0974f, 8.2204f, 7.0045f)
                curveTo(8.2907f, 6.9852f, 8.3602f, 6.963f, 8.4289f, 6.9378f)
                curveTo(8.7594f, 6.8167f, 9.0557f, 6.6084f, 9.6485f, 6.1916f)
                curveTo(11.9872f, 4.5474f, 13.1565f, 3.7253f, 14.138f, 4.0824f)
                curveTo(14.3261f, 4.1509f, 14.5083f, 4.2497f, 14.671f, 4.3716f)
                curveTo(15.5194f, 5.0074f, 15.5839f, 6.4868f, 15.7128f, 9.4454f)
                curveTo(15.7606f, 10.5409f, 15.7931f, 11.4785f, 15.7931f, 12.0f)
                curveTo(15.7931f, 12.5215f, 15.7606f, 13.4591f, 15.7128f, 14.5546f)
                curveTo(15.5839f, 17.5132f, 15.5194f, 18.9926f, 14.671f, 19.6284f)
                curveTo(14.5083f, 19.7503f, 14.3261f, 19.8491f, 14.138f, 19.9176f)
                curveTo(13.1565f, 20.2747f, 11.9872f, 19.4526f, 9.6485f, 17.8084f)
                curveTo(9.0557f, 17.3916f, 8.7594f, 17.1833f, 8.4289f, 17.0622f)
                curveTo(8.3602f, 17.037f, 8.2907f, 17.0148f, 8.2204f, 16.9955f)
                curveTo(7.882f, 16.9026f, 7.527f, 16.9026f, 6.8171f, 16.9026f)
                curveTo(4.8299f, 16.9026f, 3.8364f, 16.9026f, 3.0838f, 16.2673f)
                curveTo(2.9465f, 16.1513f, 2.7826f, 15.9803f, 2.6709f, 15.8364f)
                curveTo(2.059f, 15.0478f, 2.0403f, 14.1267f, 2.003f, 12.2845f)
                curveTo(2.001f, 12.1878f, 2.0f, 12.0928f, 2.0f, 12.0f)
                curveTo(2.0f, 11.9072f, 2.001f, 11.8122f, 2.003f, 11.7155f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(19.4896f, 5.5523f)
                curveTo(19.7822f, 5.2923f, 20.2171f, 5.3344f, 20.4609f, 5.6465f)
                lineTo(19.9311f, 6.1172f)
                curveTo(20.4609f, 5.6465f, 20.4609f, 5.6465f, 20.4609f, 5.6465f)
                lineTo(20.462f, 5.6478f)
                lineTo(20.4632f, 5.6493f)
                lineTo(20.4659f, 5.6529f)
                lineTo(20.4728f, 5.662f)
                curveTo(20.478f, 5.6689f, 20.4845f, 5.6777f, 20.4922f, 5.6883f)
                curveTo(20.5075f, 5.7094f, 20.5276f, 5.7378f, 20.5516f, 5.7737f)
                curveTo(20.5996f, 5.8454f, 20.6636f, 5.9468f, 20.738f, 6.079f)
                curveTo(20.8869f, 6.3436f, 21.0771f, 6.731f, 21.2645f, 7.2505f)
                curveTo(21.6398f, 8.2912f, 22.0001f, 9.8515f, 22.0001f, 12.0003f)
                curveTo(22.0001f, 14.1492f, 21.6398f, 15.7095f, 21.2645f, 16.7502f)
                curveTo(21.0771f, 17.2697f, 20.8869f, 17.6571f, 20.738f, 17.9217f)
                curveTo(20.6636f, 18.0539f, 20.5996f, 18.1553f, 20.5516f, 18.227f)
                curveTo(20.5276f, 18.2629f, 20.5075f, 18.2913f, 20.4922f, 18.3124f)
                curveTo(20.4845f, 18.323f, 20.478f, 18.3318f, 20.4728f, 18.3387f)
                lineTo(20.4659f, 18.3478f)
                lineTo(20.4632f, 18.3514f)
                lineTo(20.462f, 18.3529f)
                curveTo(20.462f, 18.3529f, 20.4609f, 18.3542f, 19.9311f, 17.8834f)
                lineTo(20.4609f, 18.3542f)
                curveTo(20.2171f, 18.6662f, 19.7822f, 18.7084f, 19.4896f, 18.4484f)
                curveTo(19.1984f, 18.1896f, 19.1579f, 17.7291f, 19.3978f, 17.4172f)
                curveTo(19.3978f, 17.4172f, 19.3995f, 17.4149f, 19.401f, 17.4128f)
                curveTo(19.4059f, 17.4061f, 19.4155f, 17.3926f, 19.4292f, 17.3721f)
                curveTo(19.4566f, 17.3312f, 19.5004f, 17.2626f, 19.5553f, 17.165f)
                curveTo(19.665f, 16.9699f, 19.8196f, 16.6588f, 19.9771f, 16.2222f)
                curveTo(20.2914f, 15.3509f, 20.6208f, 13.9696f, 20.6208f, 12.0003f)
                curveTo(20.6208f, 10.031f, 20.2914f, 8.6498f, 19.9771f, 7.7785f)
                curveTo(19.8196f, 7.3419f, 19.665f, 7.0308f, 19.5553f, 6.8357f)
                curveTo(19.5004f, 6.7381f, 19.4566f, 6.6694f, 19.4292f, 6.6286f)
                curveTo(19.4155f, 6.6081f, 19.4059f, 6.5946f, 19.401f, 6.5879f)
                curveTo(19.3995f, 6.5857f, 19.3978f, 6.5835f, 19.3978f, 6.5835f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(17.7572f, 8.4159f)
                curveTo(18.0902f, 8.2187f, 18.51f, 8.3466f, 18.695f, 8.7016f)
                lineTo(18.0921f, 9.0588f)
                curveTo(18.695f, 8.7016f, 18.695f, 8.7016f, 18.695f, 8.7016f)
                lineTo(18.6957f, 8.7029f)
                lineTo(18.6964f, 8.7043f)
                lineTo(18.6979f, 8.7073f)
                lineTo(18.7014f, 8.7142f)
                lineTo(18.7103f, 8.7322f)
                curveTo(18.717f, 8.746f, 18.7251f, 8.7634f, 18.7345f, 8.7845f)
                curveTo(18.7534f, 8.8267f, 18.7772f, 8.8836f, 18.8043f, 8.9557f)
                curveTo(18.8584f, 9.1f, 18.9252f, 9.3049f, 18.9901f, 9.5747f)
                curveTo(19.12f, 10.1149f, 19.2415f, 10.9118f, 19.2415f, 12.0003f)
                curveTo(19.2415f, 13.0888f, 19.12f, 13.8857f, 18.9901f, 14.4259f)
                curveTo(18.9252f, 14.6958f, 18.8584f, 14.9006f, 18.8043f, 15.0449f)
                curveTo(18.7772f, 15.117f, 18.7534f, 15.1739f, 18.7345f, 15.2161f)
                curveTo(18.7251f, 15.2372f, 18.717f, 15.2546f, 18.7103f, 15.2684f)
                lineTo(18.7014f, 15.2864f)
                lineTo(18.6979f, 15.2934f)
                lineTo(18.6964f, 15.2963f)
                lineTo(18.6957f, 15.2977f)
                curveTo(18.6957f, 15.2977f, 18.695f, 15.299f, 18.0921f, 14.9419f)
                lineTo(18.695f, 15.299f)
                curveTo(18.51f, 15.654f, 18.0902f, 15.782f, 17.7572f, 15.5847f)
                curveTo(17.4271f, 15.3891f, 17.3063f, 14.9474f, 17.4846f, 14.5938f)
                lineTo(17.4892f, 14.5838f)
                curveTo(17.4955f, 14.5696f, 17.5076f, 14.5415f, 17.5236f, 14.4987f)
                curveTo(17.5557f, 14.4132f, 17.6039f, 14.2687f, 17.654f, 14.0606f)
                curveTo(17.754f, 13.6448f, 17.8622f, 12.9709f, 17.8622f, 12.0003f)
                curveTo(17.8622f, 11.0297f, 17.754f, 10.3558f, 17.654f, 9.94f)
                curveTo(17.6039f, 9.7319f, 17.5557f, 9.5875f, 17.5236f, 9.5019f)
                curveTo(17.5076f, 9.4592f, 17.4955f, 9.431f, 17.4892f, 9.4169f)
                lineTo(17.4846f, 9.4068f)
                curveTo(17.3063f, 9.0533f, 17.4271f, 8.6115f, 17.7572f, 8.4159f)
                close()
            }
        }
            .build()
        return _volumeLoud!!
    }

private var _volumeLoud: ImageVector? = null
