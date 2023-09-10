package com.chiksmedina.solar.broken.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ArrowsGroup

val ArrowsGroup.Restart: ImageVector
    get() {
        if (_restart != null) {
            return _restart!!
        }
        _restart = Builder(
            name = "Restart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                    NonZero
                ) {
                    moveTo(19.7285f, 10.9288f)
                    curveTo(20.4413f, 13.5978f, 19.7507f, 16.5635f, 17.6569f, 18.6573f)
                    curveTo(15.1798f, 21.1344f, 11.4826f, 21.6475f, 8.5f, 20.1966f)
                    moveTo(18.364f, 8.0507f)
                    lineTo(17.6569f, 7.3436f)
                    curveTo(14.5327f, 4.2194f, 9.4674f, 4.2194f, 6.3432f, 7.3436f)
                    curveTo(3.4296f, 10.2571f, 3.2332f, 14.8588f, 5.7538f, 18.0f)
                    moveTo(18.364f, 8.0507f)
                    horizontalLineTo(14.1213f)
                    moveTo(18.364f, 8.0507f)
                    verticalLineTo(3.8081f)
                }
            }
        }
            .build()
        return _restart!!
    }

private var _restart: ImageVector? = null
