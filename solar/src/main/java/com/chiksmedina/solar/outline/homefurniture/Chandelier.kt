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

public val HomeFurnitureGroup.Chandelier: ImageVector
    get() {
        if (_chandelier != null) {
            return _chandelier!!
        }
        _chandelier = Builder(name = "Chandelier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.25f, 4.0f)
                curveTo(8.25f, 3.5858f, 8.5858f, 3.25f, 9.0f, 3.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 3.25f, 15.75f, 3.5858f, 15.75f, 4.0f)
                curveTo(15.75f, 4.4142f, 15.4142f, 4.75f, 15.0f, 4.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.5f)
                curveTo(12.75f, 18.0188f, 13.9812f, 19.25f, 15.5f, 19.25f)
                curveTo(16.9604f, 19.25f, 18.1549f, 18.1117f, 18.2446f, 16.6739f)
                curveTo(16.5356f, 16.3243f, 15.25f, 14.8123f, 15.25f, 13.0f)
                verticalLineTo(11.2f)
                curveTo(15.25f, 10.123f, 16.123f, 9.25f, 17.2f, 9.25f)
                horizontalLineTo(20.8f)
                curveTo(21.877f, 9.25f, 22.75f, 10.123f, 22.75f, 11.2f)
                verticalLineTo(13.0f)
                curveTo(22.75f, 14.8155f, 21.4599f, 16.3296f, 19.7464f, 16.6757f)
                curveTo(19.6543f, 18.9414f, 17.7884f, 20.75f, 15.5f, 20.75f)
                curveTo(14.0484f, 20.75f, 12.7667f, 20.0222f, 12.0f, 18.9116f)
                curveTo(11.2333f, 20.0222f, 9.9516f, 20.75f, 8.5f, 20.75f)
                curveTo(6.2116f, 20.75f, 4.3457f, 18.9414f, 4.2536f, 16.6757f)
                curveTo(2.5401f, 16.3296f, 1.25f, 14.8155f, 1.25f, 13.0f)
                verticalLineTo(10.8571f)
                curveTo(1.25f, 9.9695f, 1.9695f, 9.25f, 2.8571f, 9.25f)
                horizontalLineTo(7.1429f)
                curveTo(8.0305f, 9.25f, 8.75f, 9.9695f, 8.75f, 10.8571f)
                verticalLineTo(13.0f)
                curveTo(8.75f, 14.8123f, 7.4644f, 16.3243f, 5.7554f, 16.6739f)
                curveTo(5.8451f, 18.1117f, 7.0396f, 19.25f, 8.5f, 19.25f)
                curveTo(10.0188f, 19.25f, 11.25f, 18.0188f, 11.25f, 16.5f)
                verticalLineTo(4.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 4.75f, 8.25f, 4.4142f, 8.25f, 4.0f)
                close()
                moveTo(2.8571f, 10.75f)
                curveTo(2.798f, 10.75f, 2.75f, 10.798f, 2.75f, 10.8571f)
                verticalLineTo(13.0f)
                curveTo(2.75f, 14.2426f, 3.7574f, 15.25f, 5.0f, 15.25f)
                curveTo(6.2426f, 15.25f, 7.25f, 14.2426f, 7.25f, 13.0f)
                verticalLineTo(10.8571f)
                curveTo(7.25f, 10.798f, 7.202f, 10.75f, 7.1429f, 10.75f)
                horizontalLineTo(2.8571f)
                close()
                moveTo(17.2f, 10.75f)
                curveTo(16.9515f, 10.75f, 16.75f, 10.9515f, 16.75f, 11.2f)
                verticalLineTo(13.0f)
                curveTo(16.75f, 14.2426f, 17.7574f, 15.25f, 19.0f, 15.25f)
                curveTo(20.2426f, 15.25f, 21.25f, 14.2426f, 21.25f, 13.0f)
                verticalLineTo(11.2f)
                curveTo(21.25f, 10.9515f, 21.0485f, 10.75f, 20.8f, 10.75f)
                horizontalLineTo(17.2f)
                close()
            }
        }
        .build()
        return _chandelier!!
    }

private var _chandelier: ImageVector? = null
