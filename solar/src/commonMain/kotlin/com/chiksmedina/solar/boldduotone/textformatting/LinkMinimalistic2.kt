package com.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.LinkMinimalistic2: ImageVector
    get() {
        if (_linkMinimalistic2 != null) {
            return _linkMinimalistic2!!
        }
        _linkMinimalistic2 = Builder(
            name = "LinkMinimalistic2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.7388f, 4.2612f)
                curveTo(17.0572f, 1.5796f, 12.7095f, 1.5796f, 10.0279f, 4.2612f)
                lineTo(9.3071f, 4.982f)
                curveTo(9.0142f, 5.2749f, 9.0142f, 5.7498f, 9.3071f, 6.0427f)
                curveTo(9.6f, 6.3356f, 10.0748f, 6.3356f, 10.3677f, 6.0427f)
                lineTo(11.0886f, 5.3218f)
                curveTo(13.1844f, 3.226f, 16.5823f, 3.226f, 18.6781f, 5.3218f)
                curveTo(20.7739f, 7.4176f, 20.7739f, 10.8156f, 18.6781f, 12.9114f)
                lineTo(17.9573f, 13.6322f)
                curveTo(17.6644f, 13.9251f, 17.6644f, 14.4f, 17.9573f, 14.6929f)
                curveTo(18.2502f, 14.9858f, 18.725f, 14.9858f, 19.0179f, 14.6929f)
                lineTo(19.7388f, 13.972f)
                curveTo(22.4203f, 11.2905f, 22.4203f, 6.9428f, 19.7388f, 4.2612f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0427f, 9.3071f)
                curveTo(6.3356f, 9.6f, 6.3356f, 10.0748f, 6.0427f, 10.3677f)
                lineTo(5.3218f, 11.0886f)
                curveTo(3.226f, 13.1844f, 3.226f, 16.5823f, 5.3218f, 18.6781f)
                curveTo(7.4176f, 20.7739f, 10.8156f, 20.7739f, 12.9114f, 18.6781f)
                lineTo(13.6322f, 17.9573f)
                curveTo(13.9251f, 17.6644f, 14.4f, 17.6644f, 14.6929f, 17.9573f)
                curveTo(14.9858f, 18.2501f, 14.9858f, 18.725f, 14.6929f, 19.0179f)
                lineTo(13.972f, 19.7388f)
                curveTo(11.2905f, 22.4203f, 6.9428f, 22.4203f, 4.2612f, 19.7388f)
                curveTo(1.5796f, 17.0572f, 1.5796f, 12.7095f, 4.2612f, 10.0279f)
                lineTo(4.982f, 9.3071f)
                curveTo(5.2749f, 9.0142f, 5.7498f, 9.0142f, 6.0427f, 9.3071f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.6933f, 9.3071f)
                curveTo(14.9862f, 9.6f, 14.9862f, 10.0748f, 14.6933f, 10.3677f)
                lineTo(10.3682f, 14.6928f)
                curveTo(10.0753f, 14.9857f, 9.6004f, 14.9857f, 9.3076f, 14.6928f)
                curveTo(9.0147f, 14.3999f, 9.0147f, 13.9251f, 9.3076f, 13.6322f)
                lineTo(13.6327f, 9.3071f)
                curveTo(13.9255f, 9.0142f, 14.4004f, 9.0142f, 14.6933f, 9.3071f)
                close()
            }
        }
            .build()
        return _linkMinimalistic2!!
    }

private var _linkMinimalistic2: ImageVector? = null
