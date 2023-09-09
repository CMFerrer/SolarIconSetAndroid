package com.chiksmedina.solar.broken.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SportsGroup

public val SportsGroup.RunningRound: ImageVector
    get() {
        if (_runningRound != null) {
            return _runningRound!!
        }
        _runningRound = Builder(name = "RunningRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 4.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.4f, 22.0001f)
                verticalLineTo(21.195f)
                curveTo(14.4f, 21.1172f, 14.4f, 21.0783f, 14.3996f, 21.0414f)
                curveTo(14.377f, 18.902f, 13.3773f, 16.8905f, 11.6857f, 15.5807f)
                curveTo(11.6565f, 15.558f, 11.6255f, 15.5345f, 11.5635f, 15.4876f)
                curveTo(11.5235f, 15.4573f, 11.5035f, 15.4421f, 11.4877f, 15.4296f)
                curveTo(10.5309f, 14.6741f, 10.467f, 13.2456f, 11.3524f, 12.4075f)
                curveTo(11.367f, 12.3937f, 11.3857f, 12.3767f, 11.4227f, 12.3431f)
                lineTo(12.4628f, 11.3976f)
                curveTo(14.0898f, 9.9185f, 13.5945f, 7.2447f, 11.5457f, 6.4464f)
                curveTo(10.8122f, 6.1607f, 9.9952f, 6.1786f, 9.275f, 6.4964f)
                lineTo(8.7534f, 6.7265f)
                moveTo(5.439f, 8.6117f)
                lineTo(4.0f, 9.6364f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                lineTo(8.7406f, 17.3112f)
                curveTo(7.3209f, 19.0149f, 5.2177f, 20.0f, 3.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                curveTo(17.3131f, 12.3283f, 18.6869f, 12.3283f, 20.0f, 12.0f)
            }
        }
        .build()
        return _runningRound!!
    }

private var _runningRound: ImageVector? = null
