package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.MagicStick: ImageVector
    get() {
        if (_magicStick != null) {
            return _magicStick!!
        }
        _magicStick = Builder(name = "MagicStick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.6187f, 3.7778f)
                curveTo(14.7918f, 2.3904f, 15.8784f, 1.6966f, 16.7137f, 2.1266f)
                curveTo(17.5491f, 2.5565f, 17.58f, 3.8254f, 17.6418f, 6.3631f)
                lineTo(17.6578f, 7.0197f)
                curveTo(17.6753f, 7.7408f, 17.6841f, 8.1014f, 17.8327f, 8.4128f)
                curveTo(17.9813f, 8.7242f, 18.2529f, 8.9512f, 18.7961f, 9.4052f)
                lineTo(19.2906f, 9.8185f)
                curveTo(21.202f, 11.416f, 22.1577f, 12.2148f, 21.9787f, 13.1603f)
                curveTo(21.7997f, 14.1059f, 20.6046f, 14.572f, 18.2142f, 15.5043f)
                lineTo(17.5958f, 15.7454f)
                curveTo(16.9165f, 16.0104f, 16.5769f, 16.1428f, 16.3222f, 16.3918f)
                curveTo(16.0675f, 16.6409f, 15.9266f, 16.9783f, 15.6448f, 17.6531f)
                lineTo(15.3882f, 18.2675f)
                curveTo(14.3964f, 20.6423f, 13.9005f, 21.8297f, 12.9545f, 21.9842f)
                curveTo(12.0085f, 22.1386f, 11.2389f, 21.1578f, 9.6998f, 19.1963f)
                lineTo(9.3016f, 18.6888f)
                curveTo(8.8643f, 18.1314f, 8.6456f, 17.8526f, 8.3396f, 17.6952f)
                curveTo(8.0336f, 17.5377f, 7.6749f, 17.5192f, 6.9575f, 17.4823f)
                lineTo(6.3044f, 17.4487f)
                curveTo(3.78f, 17.3189f, 2.5178f, 17.254f, 2.1122f, 16.4039f)
                curveTo(1.7065f, 15.5538f, 2.4261f, 14.4815f, 3.8652f, 12.3369f)
                lineTo(4.2375f, 11.7821f)
                curveTo(4.6465f, 11.1727f, 4.851f, 10.868f, 4.9165f, 10.5216f)
                curveTo(4.9821f, 10.1752f, 4.9014f, 9.8264f, 4.7398f, 9.1287f)
                lineTo(4.5928f, 8.4936f)
                curveTo(4.0244f, 6.0385f, 3.7402f, 4.811f, 4.4355f, 4.1312f)
                curveTo(5.1308f, 3.4514f, 6.3451f, 3.7694f, 8.7736f, 4.4056f)
                lineTo(9.4019f, 4.5702f)
                curveTo(10.092f, 4.751f, 10.4371f, 4.8414f, 10.7836f, 4.7848f)
                curveTo(11.1301f, 4.7282f, 11.4389f, 4.5311f, 12.0565f, 4.1368f)
                lineTo(12.6187f, 3.7778f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5303f, 18.4697f)
                curveTo(19.2374f, 18.1768f, 18.7626f, 18.1768f, 18.4697f, 18.4697f)
                curveTo(18.1768f, 18.7626f, 18.1768f, 19.2374f, 18.4697f, 19.5303f)
                lineTo(19.5303f, 18.4697f)
                close()
                moveTo(20.4697f, 21.5303f)
                curveTo(20.7626f, 21.8232f, 21.2374f, 21.8232f, 21.5303f, 21.5303f)
                curveTo(21.8232f, 21.2374f, 21.8232f, 20.7626f, 21.5303f, 20.4697f)
                lineTo(20.4697f, 21.5303f)
                close()
                moveTo(18.4697f, 19.5303f)
                lineTo(20.4697f, 21.5303f)
                lineTo(21.5303f, 20.4697f)
                lineTo(19.5303f, 18.4697f)
                lineTo(18.4697f, 19.5303f)
                close()
            }
        }
        .build()
        return _magicStick!!
    }

private var _magicStick: ImageVector? = null
