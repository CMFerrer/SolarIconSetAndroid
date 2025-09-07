package com.chiksmedina.solar.lineduotone.homefurniture

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
import com.chiksmedina.solar.lineduotone.HomeFurnitureGroup

val HomeFurnitureGroup.Chandelier: ImageVector
    get() {
        if (_chandelier != null) {
            return _chandelier!!
        }
        _chandelier = Builder(
            name = "Chandelier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 4.0f)
                horizontalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 11.2f)
                curveTo(16.0f, 10.5373f, 16.5373f, 10.0f, 17.2f, 10.0f)
                horizontalLineTo(20.8f)
                curveTo(21.4627f, 10.0f, 22.0f, 10.5373f, 22.0f, 11.2f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 14.6569f, 20.6569f, 16.0f, 19.0f, 16.0f)
                curveTo(17.3431f, 16.0f, 16.0f, 14.6569f, 16.0f, 13.0f)
                verticalLineTo(11.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 4.0f)
                verticalLineTo(16.5f)
                moveTo(12.0f, 16.5f)
                curveTo(12.0f, 18.433f, 13.567f, 20.0f, 15.5f, 20.0f)
                curveTo(17.433f, 20.0f, 19.0f, 18.433f, 19.0f, 16.5f)
                verticalLineTo(16.4444f)
                moveTo(12.0f, 16.5f)
                curveTo(12.0f, 18.433f, 10.433f, 20.0f, 8.5f, 20.0f)
                curveTo(6.567f, 20.0f, 5.0f, 18.433f, 5.0f, 16.5f)
                verticalLineTo(16.4444f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 10.8571f)
                curveTo(8.0f, 10.3838f, 7.6162f, 10.0f, 7.1429f, 10.0f)
                horizontalLineTo(2.8571f)
                curveTo(2.3838f, 10.0f, 2.0f, 10.3838f, 2.0f, 10.8571f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 14.6569f, 3.3431f, 16.0f, 5.0f, 16.0f)
                curveTo(6.6568f, 16.0f, 8.0f, 14.6569f, 8.0f, 13.0f)
                verticalLineTo(10.8571f)
                close()
            }
        }
            .build()
        return _chandelier!!
    }

private var _chandelier: ImageVector? = null
