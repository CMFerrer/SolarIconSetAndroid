package dev.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.BombMinimalistic: ImageVector
    get() {
        if (_bombMinimalistic != null) {
            return _bombMinimalistic!!
        }
        _bombMinimalistic = Builder(
            name = "BombMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.6646f, 2.8292f)
                curveTo(16.0351f, 2.6439f, 16.4856f, 2.7941f, 16.6708f, 3.1646f)
                lineTo(17.1708f, 4.1646f)
                curveTo(17.3561f, 4.5351f, 17.2059f, 4.9856f, 16.8354f, 5.1708f)
                curveTo(16.4649f, 5.3561f, 16.0144f, 5.2059f, 15.8292f, 4.8354f)
                lineTo(15.3292f, 3.8354f)
                curveTo(15.1439f, 3.4649f, 15.2941f, 3.0144f, 15.6646f, 2.8292f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 14.5f)
                curveTo(1.25f, 9.9437f, 4.9436f, 6.25f, 9.5f, 6.25f)
                curveTo(11.5081f, 6.25f, 13.3487f, 6.9675f, 14.7793f, 8.16f)
                lineTo(16.4697f, 6.4697f)
                curveTo(16.7626f, 6.1768f, 17.2374f, 6.1768f, 17.5303f, 6.4697f)
                curveTo(17.8232f, 6.7626f, 17.8232f, 7.2374f, 17.5303f, 7.5303f)
                lineTo(15.84f, 9.2207f)
                curveTo(17.0325f, 10.6513f, 17.75f, 12.4919f, 17.75f, 14.5f)
                curveTo(17.75f, 19.0563f, 14.0563f, 22.75f, 9.5f, 22.75f)
                curveTo(4.9436f, 22.75f, 1.25f, 19.0563f, 1.25f, 14.5f)
                close()
                moveTo(9.5f, 7.75f)
                curveTo(5.7721f, 7.75f, 2.75f, 10.7721f, 2.75f, 14.5f)
                curveTo(2.75f, 18.2279f, 5.7721f, 21.25f, 9.5f, 21.25f)
                curveTo(13.2279f, 21.25f, 16.25f, 18.2279f, 16.25f, 14.5f)
                curveTo(16.25f, 10.7721f, 13.2279f, 7.75f, 9.5f, 7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.8354f, 6.8292f)
                curveTo(19.4649f, 6.6439f, 19.0144f, 6.7941f, 18.8292f, 7.1646f)
                curveTo(18.6439f, 7.5351f, 18.7941f, 7.9856f, 19.1646f, 8.1708f)
                lineTo(20.1646f, 8.6708f)
                curveTo(20.5351f, 8.8561f, 20.9856f, 8.7059f, 21.1708f, 8.3354f)
                curveTo(21.3561f, 7.9649f, 21.2059f, 7.5144f, 20.8354f, 7.3292f)
                lineTo(19.8354f, 6.8292f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.5303f, 4.5303f)
                curveTo(20.8232f, 4.2374f, 20.8232f, 3.7626f, 20.5303f, 3.4697f)
                curveTo(20.2374f, 3.1768f, 19.7626f, 3.1768f, 19.4697f, 3.4697f)
                lineTo(18.4697f, 4.4697f)
                curveTo(18.1768f, 4.7626f, 18.1768f, 5.2374f, 18.4697f, 5.5303f)
                curveTo(18.7626f, 5.8232f, 19.2374f, 5.8232f, 19.5303f, 5.5303f)
                lineTo(20.5303f, 4.5303f)
                close()
            }
        }
            .build()
        return _bombMinimalistic!!
    }

private var _bombMinimalistic: ImageVector? = null
