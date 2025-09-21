package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.MagicStick2: ImageVector
    get() {
        if (_magicStick2 != null) {
            return _magicStick2!!
        }
        _magicStick2 = Builder(
            name = "MagicStick2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.7137f, 2.1266f)
                curveTo(15.8784f, 1.6966f, 14.7918f, 2.3904f, 12.6187f, 3.7778f)
                lineTo(12.0565f, 4.1368f)
                curveTo(11.4389f, 4.5311f, 11.1301f, 4.7282f, 10.7836f, 4.7848f)
                curveTo(10.4371f, 4.8414f, 10.092f, 4.751f, 9.4019f, 4.5702f)
                lineTo(8.7736f, 4.4056f)
                curveTo(6.3451f, 3.7694f, 5.1308f, 3.4514f, 4.4355f, 4.1312f)
                curveTo(3.7402f, 4.811f, 4.0244f, 6.0385f, 4.5928f, 8.4936f)
                lineTo(4.7398f, 9.1287f)
                curveTo(4.9014f, 9.8264f, 4.9821f, 10.1752f, 4.9165f, 10.5216f)
                curveTo(4.851f, 10.868f, 4.6465f, 11.1727f, 4.2375f, 11.7821f)
                lineTo(3.8652f, 12.3369f)
                curveTo(2.4261f, 14.4815f, 1.7065f, 15.5538f, 2.1122f, 16.4039f)
                curveTo(2.5178f, 17.254f, 3.78f, 17.3189f, 6.3044f, 17.4487f)
                lineTo(6.9575f, 17.4823f)
                curveTo(7.6749f, 17.5192f, 8.0336f, 17.5377f, 8.3396f, 17.6952f)
                curveTo(8.6456f, 17.8526f, 8.8643f, 18.1314f, 9.3016f, 18.6888f)
                lineTo(9.6998f, 19.1963f)
                curveTo(11.2389f, 21.1578f, 12.0085f, 22.1386f, 12.9545f, 21.9842f)
                curveTo(13.9005f, 21.8297f, 14.3964f, 20.6423f, 15.3882f, 18.2675f)
                lineTo(15.6448f, 17.6531f)
                curveTo(15.9266f, 16.9783f, 16.0675f, 16.6409f, 16.3222f, 16.3918f)
                curveTo(16.5769f, 16.1428f, 16.9165f, 16.0104f, 17.5958f, 15.7454f)
                lineTo(18.2142f, 15.5043f)
                curveTo(20.6046f, 14.572f, 21.7997f, 14.1059f, 21.9787f, 13.1603f)
                curveTo(22.1577f, 12.2148f, 21.202f, 11.416f, 19.2906f, 9.8185f)
                lineTo(18.7961f, 9.4052f)
                curveTo(18.2529f, 8.9512f, 17.9813f, 8.7242f, 17.8327f, 8.4128f)
                curveTo(17.6841f, 8.1014f, 17.6753f, 7.7408f, 17.6578f, 7.0197f)
                lineTo(17.6418f, 6.3631f)
                curveTo(17.58f, 3.8254f, 17.5491f, 2.5565f, 16.7137f, 2.1266f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.9307f, 16.9913f)
                curveTo(16.057f, 16.7234f, 16.169f, 16.5416f, 16.3222f, 16.3918f)
                curveTo(16.4939f, 16.2239f, 16.7043f, 16.109f, 17.0314f, 15.9707f)
                lineTo(21.5303f, 20.4696f)
                curveTo(21.8232f, 20.7625f, 21.8232f, 21.2374f, 21.5303f, 21.5303f)
                curveTo(21.2374f, 21.8232f, 20.7625f, 21.8232f, 20.4697f, 21.5303f)
                lineTo(15.9307f, 16.9913f)
                close()
            }
        }
            .build()
        return _magicStick2!!
    }

private var _magicStick2: ImageVector? = null
