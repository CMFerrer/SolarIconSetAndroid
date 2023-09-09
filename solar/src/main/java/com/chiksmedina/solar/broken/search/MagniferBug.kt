package com.chiksmedina.solar.broken.search

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
import com.chiksmedina.solar.broken.SearchGroup

public val SearchGroup.MagniferBug: ImageVector
    get() {
        if (_magniferBug != null) {
            return _magniferBug!!
        }
        _magniferBug = Builder(name = "MagniferBug", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 15.5f)
                curveTo(9.8432f, 15.5f, 8.5f, 14.1569f, 8.5f, 12.5f)
                verticalLineTo(10.5f)
                moveTo(11.5f, 15.5f)
                curveTo(13.1569f, 15.5f, 14.5f, 14.1569f, 14.5f, 12.5f)
                verticalLineTo(10.5f)
                moveTo(11.5f, 15.5f)
                verticalLineTo(10.5f)
                moveTo(14.5f, 10.5f)
                curveTo(14.5f, 8.8432f, 13.1569f, 7.5f, 11.5f, 7.5f)
                curveTo(9.8432f, 7.5f, 8.5f, 8.8432f, 8.5f, 10.5f)
                moveTo(14.5f, 10.5f)
                horizontalLineTo(8.5f)
                moveTo(14.5715f, 11.5f)
                horizontalLineTo(16.0f)
                moveTo(7.0f, 11.5f)
                horizontalLineTo(8.5f)
                moveTo(14.5f, 14.0f)
                lineTo(15.5f, 14.5f)
                moveTo(8.5f, 14.0f)
                lineTo(7.5f, 14.5f)
                moveTo(14.5f, 9.0f)
                lineTo(15.5f, 8.5f)
                moveTo(8.5f, 9.0f)
                lineTo(7.5f, 8.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 18.5f)
                lineTo(22.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 3.2709f)
                curveTo(8.1473f, 2.4626f, 9.7696f, 2.0f, 11.5f, 2.0f)
                curveTo(16.7467f, 2.0f, 21.0f, 6.2533f, 21.0f, 11.5f)
                curveTo(21.0f, 16.7467f, 16.7467f, 21.0f, 11.5f, 21.0f)
                curveTo(6.2533f, 21.0f, 2.0f, 16.7467f, 2.0f, 11.5f)
                curveTo(2.0f, 9.7696f, 2.4626f, 8.1473f, 3.2709f, 6.75f)
            }
        }
        .build()
        return _magniferBug!!
    }

private var _magniferBug: ImageVector? = null
