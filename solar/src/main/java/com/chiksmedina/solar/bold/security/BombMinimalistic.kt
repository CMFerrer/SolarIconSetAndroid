package com.chiksmedina.solar.bold.security

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
import com.chiksmedina.solar.bold.SecurityGroup

public val SecurityGroup.BombMinimalistic: ImageVector
    get() {
        if (_bombMinimalistic != null) {
            return _bombMinimalistic!!
        }
        _bombMinimalistic = Builder(name = "BombMinimalistic", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6646f, 2.8292f)
                curveTo(16.0351f, 2.6439f, 16.4856f, 2.7941f, 16.6708f, 3.1646f)
                lineTo(17.1708f, 4.1646f)
                curveTo(17.3561f, 4.5351f, 17.2059f, 4.9856f, 16.8354f, 5.1708f)
                curveTo(16.4649f, 5.3561f, 16.0144f, 5.2059f, 15.8292f, 4.8354f)
                lineTo(15.3292f, 3.8354f)
                curveTo(15.1439f, 3.4649f, 15.2941f, 3.0144f, 15.6646f, 2.8292f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8292f, 7.1646f)
                curveTo(19.0144f, 6.7941f, 19.4649f, 6.6439f, 19.8354f, 6.8292f)
                lineTo(20.8354f, 7.3292f)
                curveTo(21.2059f, 7.5144f, 21.3561f, 7.9649f, 21.1708f, 8.3354f)
                curveTo(20.9856f, 8.7059f, 20.5351f, 8.8561f, 20.1646f, 8.6708f)
                lineTo(19.1646f, 8.1708f)
                curveTo(18.7941f, 7.9856f, 18.6439f, 7.5351f, 18.8292f, 7.1646f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5303f, 4.5303f)
                curveTo(20.8232f, 4.2374f, 20.8232f, 3.7626f, 20.5303f, 3.4697f)
                curveTo(20.2374f, 3.1768f, 19.7626f, 3.1768f, 19.4697f, 3.4697f)
                lineTo(18.4697f, 4.4697f)
                curveTo(18.1768f, 4.7626f, 18.1768f, 5.2374f, 18.4697f, 5.5303f)
                curveTo(18.7626f, 5.8232f, 19.2374f, 5.8232f, 19.5303f, 5.5303f)
                lineTo(20.5303f, 4.5303f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.5f)
                curveTo(17.0f, 18.6421f, 13.6421f, 22.0f, 9.5f, 22.0f)
                curveTo(5.3579f, 22.0f, 2.0f, 18.6421f, 2.0f, 14.5f)
                curveTo(2.0f, 10.3579f, 5.3579f, 7.0f, 9.5f, 7.0f)
                curveTo(13.6421f, 7.0f, 17.0f, 10.3579f, 17.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5302f, 7.5303f)
                lineTo(16.3722f, 8.6884f)
                curveTo(16.0486f, 8.3061f, 15.6938f, 7.9513f, 15.3115f, 7.6277f)
                lineTo(16.4696f, 6.4697f)
                curveTo(16.7625f, 6.1768f, 17.2373f, 6.1768f, 17.5302f, 6.4697f)
                curveTo(17.8231f, 6.7626f, 17.8231f, 7.2374f, 17.5302f, 7.5303f)
                close()
            }
        }
        .build()
        return _bombMinimalistic!!
    }

private var _bombMinimalistic: ImageVector? = null
