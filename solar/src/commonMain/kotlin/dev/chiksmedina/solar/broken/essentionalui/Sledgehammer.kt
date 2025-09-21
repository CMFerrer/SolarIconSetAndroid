package dev.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.EssentionalUiGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.6597f, 8.2861f)
                lineTo(19.028f, 7.9179f)
                curveTo(19.3704f, 7.5754f, 19.5416f, 7.4042f, 19.6445f, 7.2261f)
                curveTo(19.9236f, 6.7427f, 19.9236f, 6.1472f, 19.6445f, 5.6638f)
                curveTo(19.5416f, 5.4857f, 19.3704f, 5.3145f, 19.028f, 4.972f)
                curveTo(18.6855f, 4.6296f, 18.5143f, 4.4584f, 18.3362f, 4.3555f)
                curveTo(17.8528f, 4.0764f, 17.2573f, 4.0764f, 16.7739f, 4.3555f)
                curveTo(16.5958f, 4.4584f, 16.4246f, 4.6296f, 16.0821f, 4.972f)
                lineTo(15.7139f, 5.3403f)
                moveTo(11.2951f, 15.6507f)
                lineTo(5.7717f, 21.1742f)
                curveTo(5.4292f, 21.5166f, 5.258f, 21.6879f, 5.0799f, 21.7907f)
                curveTo(4.5965f, 22.0698f, 4.001f, 22.0698f, 3.5176f, 21.7907f)
                curveTo(3.3395f, 21.6879f, 3.1683f, 21.5166f, 2.8258f, 21.1742f)
                curveTo(2.4834f, 20.8317f, 2.3121f, 20.6605f, 2.2093f, 20.4824f)
                curveTo(1.9302f, 19.999f, 1.9302f, 19.4035f, 2.2093f, 18.9201f)
                curveTo(2.3121f, 18.742f, 2.4834f, 18.5708f, 2.8258f, 18.2283f)
                lineTo(8.3493f, 12.7049f)
                moveTo(18.0f, 17.7513f)
                curveTo(17.102f, 18.5777f, 16.4581f, 18.991f, 15.7139f, 18.991f)
                curveTo(14.6354f, 18.991f, 13.7674f, 18.123f, 12.0316f, 16.3872f)
                lineTo(7.6128f, 11.9684f)
                curveTo(5.877f, 10.2326f, 5.009f, 9.3646f, 5.009f, 8.2861f)
                curveTo(5.009f, 7.2076f, 5.877f, 6.3397f, 7.6128f, 4.6038f)
                curveTo(9.3487f, 2.8679f, 10.2166f, 2.0f, 11.2951f, 2.0f)
                curveTo(12.3737f, 2.0f, 13.2416f, 2.8679f, 14.9774f, 4.6038f)
                lineTo(19.3962f, 9.0226f)
                curveTo(21.1321f, 10.7584f, 22.0f, 11.6263f, 22.0f, 12.7049f)
                curveTo(22.0f, 13.4516f, 21.584f, 14.0973f, 20.752f, 15.0f)
            }
        }
            .build()
        return _sledgehammer!!
    }

private var _sledgehammer: ImageVector? = null
