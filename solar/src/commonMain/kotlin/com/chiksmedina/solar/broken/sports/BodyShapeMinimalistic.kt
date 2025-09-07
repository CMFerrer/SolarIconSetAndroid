package com.chiksmedina.solar.broken.sports

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
import com.chiksmedina.solar.broken.SportsGroup

val SportsGroup.BodyShapeMinimalistic: ImageVector
    get() {
        if (_bodyShapeMinimalistic != null) {
            return _bodyShapeMinimalistic!!
        }
        _bodyShapeMinimalistic = Builder(
            name = "BodyShapeMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 2.0f)
                curveTo(20.0f, 2.0f, 18.0f, 6.6884f, 18.0f, 10.5714f)
                curveTo(18.0f, 11.8147f, 18.426f, 12.855f, 19.0f, 13.8912f)
                curveTo(19.6606f, 15.0836f, 20.5171f, 16.2704f, 21.1457f, 17.7543f)
                curveTo(21.6446f, 18.932f, 22.0f, 20.2968f, 22.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 2.0f)
                curveTo(4.0f, 2.0f, 6.0f, 6.6884f, 6.0f, 10.5714f)
                curveTo(6.0f, 11.8147f, 5.574f, 12.855f, 5.0f, 13.8912f)
                curveTo(4.3394f, 15.0836f, 3.4829f, 16.2704f, 2.8543f, 17.7543f)
                curveTo(2.3554f, 18.932f, 2.0f, 20.2968f, 2.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 13.0f)
                horizontalLineTo(11.0f)
                moveTo(18.0f, 13.0f)
                horizontalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(12.5f, 20.5f, 15.0f, 17.5f, 21.0f, 17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(11.5f, 20.5f, 9.0f, 17.5f, 3.0f, 17.5f)
            }
        }
            .build()
        return _bodyShapeMinimalistic!!
    }

private var _bodyShapeMinimalistic: ImageVector? = null
