package com.chiksmedina.solar.lineduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.LikeGroup

public val LikeGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.5009f)
                curveTo(7.5002f, 0.8257f, 2.0f, 4.2744f, 2.0f, 9.1373f)
                curveTo(2.0f, 14.0003f, 6.0194f, 16.5917f, 8.9617f, 18.9111f)
                curveTo(10.0f, 19.7296f, 11.0f, 20.5002f, 12.0f, 20.5002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.5009f)
                curveTo(16.4998f, 0.8257f, 22.0f, 4.2744f, 22.0f, 9.1373f)
                curveTo(22.0f, 14.0003f, 17.9806f, 16.5917f, 15.0383f, 18.9111f)
                curveTo(14.0f, 19.7296f, 13.0f, 20.5002f, 12.0f, 20.5002f)
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
