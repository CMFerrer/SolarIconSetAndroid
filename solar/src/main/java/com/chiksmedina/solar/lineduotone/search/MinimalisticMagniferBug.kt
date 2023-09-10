package com.chiksmedina.solar.lineduotone.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SearchGroup

val SearchGroup.MinimalisticMagniferBug: ImageVector
    get() {
        if (_minimalisticMagniferBug != null) {
            return _minimalisticMagniferBug!!
        }
        _minimalisticMagniferBug = Builder(
            name = "MinimalisticMagniferBug", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF8E93A6)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5f, 11.5f)
                moveToRelative(-9.5f, 0.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, true, 19.0f, 0.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, true, -19.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 20.0f)
                lineTo(22.0f, 22.0f)
            }
        }
            .build()
        return _minimalisticMagniferBug!!
    }

private var _minimalisticMagniferBug: ImageVector? = null
