package com.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.SmartVacuumCleaner: ImageVector
    get() {
        if (_smartVacuumCleaner != null) {
            return _smartVacuumCleaner!!
        }
        _smartVacuumCleaner = Builder(
            name = "SmartVacuumCleaner", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 13.6405f, 22.3825f, 15.1952f, 21.7254f, 16.5862f)
                curveTo(22.0584f, 17.1465f, 22.25f, 17.8014f, 22.25f, 18.5f)
                curveTo(22.25f, 20.5711f, 20.5711f, 22.25f, 18.5f, 22.25f)
                curveTo(17.8014f, 22.25f, 17.1465f, 22.0584f, 16.5862f, 21.7254f)
                curveTo(15.1952f, 22.3825f, 13.6405f, 22.75f, 12.0f, 22.75f)
                curveTo(10.3594f, 22.75f, 8.8046f, 22.3825f, 7.4135f, 21.7253f)
                curveTo(6.8532f, 22.0584f, 6.1983f, 22.25f, 5.4996f, 22.25f)
                curveTo(3.4285f, 22.25f, 1.7496f, 20.5711f, 1.7496f, 18.5f)
                curveTo(1.7496f, 17.8012f, 1.9412f, 17.1462f, 2.2744f, 16.5858f)
                curveTo(1.6174f, 15.1949f, 1.25f, 13.6403f, 1.25f, 12.0f)
                close()
                moveTo(3.2619f, 18.263f)
                curveTo(3.2537f, 18.3408f, 3.2496f, 18.4199f, 3.2496f, 18.5f)
                curveTo(3.2496f, 19.7426f, 4.2569f, 20.75f, 5.4996f, 20.75f)
                curveTo(5.5796f, 20.75f, 5.6586f, 20.7458f, 5.7364f, 20.7377f)
                curveTo(4.7831f, 20.0531f, 3.9464f, 19.2164f, 3.2619f, 18.263f)
                close()
                moveTo(18.2635f, 20.7378f)
                curveTo(18.3412f, 20.7459f, 18.4201f, 20.75f, 18.5f, 20.75f)
                curveTo(19.7426f, 20.75f, 20.75f, 19.7426f, 20.75f, 18.5f)
                curveTo(20.75f, 18.4201f, 20.7459f, 18.3412f, 20.7378f, 18.2635f)
                curveTo(20.0533f, 19.2167f, 19.2167f, 20.0533f, 18.2635f, 20.7378f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(10.7574f, 6.75f, 9.75f, 7.7574f, 9.75f, 9.0f)
                curveTo(9.75f, 10.2426f, 10.7574f, 11.25f, 12.0f, 11.25f)
                curveTo(13.2426f, 11.25f, 14.25f, 10.2426f, 14.25f, 9.0f)
                curveTo(14.25f, 7.7574f, 13.2426f, 6.75f, 12.0f, 6.75f)
                close()
                moveTo(8.25f, 9.0f)
                curveTo(8.25f, 6.9289f, 9.9289f, 5.25f, 12.0f, 5.25f)
                curveTo(14.0711f, 5.25f, 15.75f, 6.9289f, 15.75f, 9.0f)
                curveTo(15.75f, 11.0711f, 14.0711f, 12.75f, 12.0f, 12.75f)
                curveTo(9.9289f, 12.75f, 8.25f, 11.0711f, 8.25f, 9.0f)
                close()
                moveTo(12.0f, 15.25f)
                curveTo(12.4142f, 15.25f, 12.75f, 15.5858f, 12.75f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                curveTo(11.5858f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(11.25f, 15.5858f, 11.5858f, 15.25f, 12.0f, 15.25f)
                close()
            }
        }
            .build()
        return _smartVacuumCleaner!!
    }

private var _smartVacuumCleaner: ImageVector? = null
