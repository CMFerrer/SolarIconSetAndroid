package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Sledgehammer: ImageVector
    get() {
        if (_sledgehammer != null) {
            return _sledgehammer!!
        }
        _sledgehammer = Builder(
            name = "Sledgehammer", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.6128f, 4.6038f)
                curveTo(9.3487f, 2.8679f, 10.2166f, 2.0f, 11.2951f, 2.0f)
                curveTo(12.3737f, 2.0f, 13.2416f, 2.8679f, 14.9774f, 4.6038f)
                lineTo(19.3962f, 9.0226f)
                curveTo(21.1321f, 10.7584f, 22.0f, 11.6263f, 22.0f, 12.7049f)
                curveTo(22.0f, 13.7834f, 21.1321f, 14.6513f, 19.3962f, 16.3872f)
                curveTo(17.6604f, 18.123f, 16.7924f, 18.991f, 15.7139f, 18.991f)
                curveTo(14.6354f, 18.991f, 13.7675f, 18.123f, 12.0316f, 16.3872f)
                lineTo(7.6128f, 11.9684f)
                curveTo(5.877f, 10.2326f, 5.009f, 9.3646f, 5.009f, 8.2861f)
                curveTo(5.009f, 7.2076f, 5.877f, 6.3397f, 7.6128f, 4.6038f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.2951f, 15.6509f)
                lineTo(5.7717f, 21.1744f)
                curveTo(5.4292f, 21.5168f, 5.258f, 21.6881f, 5.0799f, 21.7909f)
                curveTo(4.5965f, 22.07f, 4.001f, 22.07f, 3.5176f, 21.7909f)
                curveTo(3.3395f, 21.6881f, 3.1683f, 21.5168f, 2.8258f, 21.1744f)
                curveTo(2.4834f, 20.8319f, 2.3121f, 20.6607f, 2.2093f, 20.4826f)
                curveTo(1.9302f, 19.9992f, 1.9302f, 19.4037f, 2.2093f, 18.9203f)
                curveTo(2.3121f, 18.7422f, 2.4834f, 18.571f, 2.8258f, 18.2285f)
                lineTo(8.3493f, 12.7051f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.6597f, 8.2859f)
                lineTo(19.0279f, 7.9177f)
                curveTo(19.3704f, 7.5752f, 19.5416f, 7.404f, 19.6445f, 7.2259f)
                curveTo(19.9235f, 6.7425f, 19.9235f, 6.147f, 19.6445f, 5.6636f)
                curveTo(19.5416f, 5.4855f, 19.3704f, 5.3142f, 19.0279f, 4.9718f)
                curveTo(18.6855f, 4.6294f, 18.5143f, 4.4581f, 18.3362f, 4.3553f)
                curveTo(17.8528f, 4.0762f, 17.2573f, 4.0762f, 16.7739f, 4.3553f)
                curveTo(16.5958f, 4.4581f, 16.4245f, 4.6294f, 16.0821f, 4.9718f)
                lineTo(15.7139f, 5.34f)
            }
        }
            .build()
        return _sledgehammer!!
    }

private var _sledgehammer: ImageVector? = null
