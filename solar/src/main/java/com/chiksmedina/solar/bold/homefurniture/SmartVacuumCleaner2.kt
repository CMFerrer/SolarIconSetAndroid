package com.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.bold.HomeFurnitureGroup

public val HomeFurnitureGroup.SmartVacuumCleaner2: ImageVector
    get() {
        if (_smartVacuumCleaner2 != null) {
            return _smartVacuumCleaner2!!
        }
        _smartVacuumCleaner2 = Builder(name = "SmartVacuumCleaner2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                curveTo(10.7574f, 6.5f, 9.75f, 7.5074f, 9.75f, 8.75f)
                curveTo(9.75f, 9.9926f, 10.7574f, 11.0f, 12.0f, 11.0f)
                curveTo(13.2426f, 11.0f, 14.25f, 9.9926f, 14.25f, 8.75f)
                curveTo(14.25f, 7.5074f, 13.2426f, 6.5f, 12.0f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5209f, 19.3316f)
                curveTo(16.7701f, 20.8389f, 14.4915f, 21.75f, 12.0f, 21.75f)
                curveTo(9.5085f, 21.75f, 7.2299f, 20.8389f, 5.4791f, 19.3316f)
                lineTo(2.5303f, 22.2803f)
                curveTo(2.2374f, 22.5732f, 1.7626f, 22.5732f, 1.4697f, 22.2803f)
                curveTo(1.1768f, 21.9874f, 1.1768f, 21.5126f, 1.4697f, 21.2197f)
                lineTo(4.4184f, 18.2709f)
                curveTo(2.9111f, 16.5201f, 2.0f, 14.2415f, 2.0f, 11.75f)
                curveTo(2.0f, 6.2271f, 6.4771f, 1.75f, 12.0f, 1.75f)
                curveTo(17.5228f, 1.75f, 22.0f, 6.2271f, 22.0f, 11.75f)
                curveTo(22.0f, 14.2415f, 21.0889f, 16.5201f, 19.5816f, 18.2709f)
                lineTo(22.5303f, 21.2197f)
                curveTo(22.8232f, 21.5126f, 22.8232f, 21.9874f, 22.5303f, 22.2803f)
                curveTo(22.2374f, 22.5732f, 21.7626f, 22.5732f, 21.4697f, 22.2803f)
                lineTo(18.5209f, 19.3316f)
                close()
                moveTo(8.25f, 8.75f)
                curveTo(8.25f, 6.6789f, 9.9289f, 5.0f, 12.0f, 5.0f)
                curveTo(14.0711f, 5.0f, 15.75f, 6.6789f, 15.75f, 8.75f)
                curveTo(15.75f, 10.8211f, 14.0711f, 12.5f, 12.0f, 12.5f)
                curveTo(9.9289f, 12.5f, 8.25f, 10.8211f, 8.25f, 8.75f)
                close()
                moveTo(12.75f, 15.75f)
                curveTo(12.75f, 15.3358f, 12.4142f, 15.0f, 12.0f, 15.0f)
                curveTo(11.5858f, 15.0f, 11.25f, 15.3358f, 11.25f, 15.75f)
                verticalLineTo(17.75f)
                curveTo(11.25f, 18.1642f, 11.5858f, 18.5f, 12.0f, 18.5f)
                curveTo(12.4142f, 18.5f, 12.75f, 18.1642f, 12.75f, 17.75f)
                verticalLineTo(15.75f)
                close()
            }
        }
        .build()
        return _smartVacuumCleaner2!!
    }

private var _smartVacuumCleaner2: ImageVector? = null
