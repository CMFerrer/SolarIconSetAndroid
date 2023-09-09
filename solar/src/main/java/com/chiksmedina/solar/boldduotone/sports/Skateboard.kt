package com.chiksmedina.solar.boldduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.SportsGroup

public val SportsGroup.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(name = "Skateboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                curveTo(9.0f, 16.1046f, 8.1046f, 17.0f, 7.0f, 17.0f)
                curveTo(5.8954f, 17.0f, 5.0f, 16.1046f, 5.0f, 15.0f)
                curveTo(5.0f, 13.8954f, 5.8954f, 13.0f, 7.0f, 13.0f)
                curveTo(8.1046f, 13.0f, 9.0f, 13.8954f, 9.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                curveTo(19.0f, 16.1046f, 18.1046f, 17.0f, 17.0f, 17.0f)
                curveTo(15.8954f, 17.0f, 15.0f, 16.1046f, 15.0f, 15.0f)
                curveTo(15.0f, 13.8954f, 15.8954f, 13.0f, 17.0f, 13.0f)
                curveTo(18.1046f, 13.0f, 19.0f, 13.8954f, 19.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.5841f, 6.376f)
                curveTo(1.9287f, 6.1463f, 2.3944f, 6.2394f, 2.6241f, 6.5841f)
                lineTo(3.4367f, 7.8029f)
                curveTo(4.0394f, 8.707f, 5.0542f, 9.2501f, 6.1408f, 9.2501f)
                horizontalLineTo(17.8593f)
                curveTo(18.946f, 9.2501f, 19.9607f, 8.707f, 20.5635f, 7.8028f)
                lineTo(21.376f, 6.5841f)
                curveTo(21.6058f, 6.2394f, 22.0715f, 6.1463f, 22.4161f, 6.376f)
                curveTo(22.7608f, 6.6058f, 22.8539f, 7.0715f, 22.6241f, 7.4161f)
                lineTo(21.8116f, 8.6349f)
                curveTo(20.9306f, 9.9564f, 19.4475f, 10.7501f, 17.8593f, 10.7501f)
                horizontalLineTo(6.1408f)
                curveTo(4.5526f, 10.7501f, 3.0695f, 9.9564f, 2.1886f, 8.6349f)
                lineTo(1.376f, 7.4161f)
                curveTo(1.1463f, 7.0715f, 1.2394f, 6.6058f, 1.5841f, 6.376f)
                close()
            }
        }
        .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
