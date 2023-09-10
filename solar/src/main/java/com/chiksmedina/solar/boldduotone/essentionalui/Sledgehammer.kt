package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.6038f, 4.6038f)
                curveTo(9.3397f, 2.8679f, 10.2076f, 2.0f, 11.2861f, 2.0f)
                curveTo(12.3646f, 2.0f, 13.2326f, 2.8679f, 14.9684f, 4.6038f)
                lineTo(19.3872f, 9.0226f)
                curveTo(21.123f, 10.7584f, 21.991f, 11.6263f, 21.991f, 12.7049f)
                curveTo(21.991f, 13.7834f, 21.123f, 14.6513f, 19.3872f, 16.3872f)
                curveTo(17.6513f, 18.123f, 16.7834f, 18.991f, 15.7049f, 18.991f)
                curveTo(14.6263f, 18.991f, 13.7584f, 18.123f, 12.0226f, 16.3872f)
                lineTo(7.6038f, 11.9684f)
                curveTo(5.8679f, 10.2326f, 5.0f, 9.3646f, 5.0f, 8.2861f)
                curveTo(5.0f, 7.2076f, 5.8679f, 6.3397f, 7.6038f, 4.6038f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.3447f, 12.7093f)
                lineTo(2.8258f, 18.2281f)
                curveTo(2.4834f, 18.5706f, 2.3121f, 18.7418f, 2.2093f, 18.9199f)
                curveTo(1.9302f, 19.4033f, 1.9302f, 19.9988f, 2.2093f, 20.4822f)
                curveTo(2.3121f, 20.6603f, 2.4834f, 20.8315f, 2.8258f, 21.1739f)
                curveTo(3.1682f, 21.5164f, 3.3395f, 21.6876f, 3.5176f, 21.7905f)
                curveTo(4.001f, 22.0696f, 4.5965f, 22.0696f, 5.0799f, 21.7905f)
                curveTo(5.258f, 21.6876f, 5.4292f, 21.5164f, 5.7717f, 21.174f)
                lineTo(11.2905f, 15.6551f)
                lineTo(8.3447f, 12.7093f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.6551f, 8.2905f)
                lineTo(19.028f, 7.9177f)
                curveTo(19.3704f, 7.5752f, 19.5416f, 7.404f, 19.6445f, 7.2259f)
                curveTo(19.9236f, 6.7425f, 19.9236f, 6.147f, 19.6445f, 5.6636f)
                curveTo(19.5416f, 5.4855f, 19.3704f, 5.3142f, 19.028f, 4.9718f)
                curveTo(18.6855f, 4.6294f, 18.5143f, 4.4581f, 18.3362f, 4.3553f)
                curveTo(17.8528f, 4.0762f, 17.2573f, 4.0762f, 16.7739f, 4.3553f)
                curveTo(16.5958f, 4.4581f, 16.4246f, 4.6294f, 16.0821f, 4.9718f)
                lineTo(15.7093f, 5.3447f)
                lineTo(18.6551f, 8.2905f)
                close()
            }
        }
            .build()
        return _sledgehammer!!
    }

private var _sledgehammer: ImageVector? = null
