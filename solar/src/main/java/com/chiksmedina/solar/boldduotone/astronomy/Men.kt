package com.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.AstronomyGroup

public val AstronomyGroup.Men: ImageVector
    get() {
        if (_men != null) {
            return _men!!
        }
        _men = Builder(name = "Men", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                moveToRelative(-8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 1.25f)
                curveTo(16.5858f, 1.25f, 16.25f, 1.5858f, 16.25f, 2.0f)
                curveTo(16.25f, 2.4142f, 16.5858f, 2.75f, 17.0f, 2.75f)
                horizontalLineTo(20.1894f)
                lineTo(15.1018f, 7.8376f)
                curveTo(15.4875f, 8.1573f, 15.8428f, 8.5125f, 16.1625f, 8.8982f)
                lineTo(21.25f, 3.8107f)
                verticalLineTo(7.0f)
                curveTo(21.25f, 7.4142f, 21.5858f, 7.75f, 22.0f, 7.75f)
                curveTo(22.4143f, 7.75f, 22.75f, 7.4142f, 22.75f, 7.0f)
                verticalLineTo(2.25f)
                curveTo(22.75f, 1.6977f, 22.3023f, 1.25f, 21.75f, 1.25f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _men!!
    }

private var _men: ImageVector? = null
