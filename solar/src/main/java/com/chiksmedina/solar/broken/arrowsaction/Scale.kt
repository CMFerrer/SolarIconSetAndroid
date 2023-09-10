package com.chiksmedina.solar.broken.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ArrowsActionGroup

val ArrowsActionGroup.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(
            name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0002f, 11.9994f)
                curveTo(2.0002f, 16.7135f, 2.0002f, 19.0705f, 3.4647f, 20.535f)
                curveTo(4.9292f, 21.9994f, 7.2862f, 21.9994f, 12.0002f, 21.9994f)
                curveTo(16.7143f, 21.9994f, 19.0713f, 21.9994f, 20.5358f, 20.535f)
                curveTo(21.8928f, 19.1779f, 21.9924f, 17.0545f, 21.9997f, 12.9994f)
                moveTo(11.0002f, 2.0f)
                curveTo(6.9452f, 2.0073f, 4.8217f, 2.1069f, 3.4647f, 3.4639f)
                curveTo(2.6481f, 4.2805f, 2.2869f, 5.3745f, 2.127f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 11.0f)
                lineTo(22.0f, 2.0f)
                moveTo(22.0f, 2.0f)
                horizontalLineTo(16.6562f)
                moveTo(22.0f, 2.0f)
                verticalLineTo(7.3438f)
                moveTo(21.0f, 3.0f)
                lineTo(12.0f, 12.0f)
                moveTo(12.0f, 12.0f)
                horizontalLineTo(16.0f)
                moveTo(12.0f, 12.0f)
                verticalLineTo(8.0f)
            }
        }
            .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
