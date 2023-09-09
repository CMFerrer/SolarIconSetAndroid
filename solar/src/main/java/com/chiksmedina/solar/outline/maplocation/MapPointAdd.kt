package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.MapPointAdd: ImageVector
    get() {
        if (_mapPointAdd != null) {
            return _mapPointAdd!!
        }
        _mapPointAdd = Builder(name = "MapPointAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.25f, 10.1433f)
                curveTo(3.25f, 5.2443f, 7.155f, 1.25f, 12.0f, 1.25f)
                curveTo(16.845f, 1.25f, 20.75f, 5.2443f, 20.75f, 10.1433f)
                curveTo(20.75f, 12.5084f, 20.076f, 15.0479f, 18.8844f, 17.2419f)
                curveTo(17.6944f, 19.4331f, 15.9556f, 21.3372f, 13.7805f, 22.3539f)
                curveTo(12.6506f, 22.882f, 11.3494f, 22.882f, 10.2195f, 22.3539f)
                curveTo(8.0444f, 21.3372f, 6.3056f, 19.4331f, 5.1156f, 17.2419f)
                curveTo(3.924f, 15.0479f, 3.25f, 12.5084f, 3.25f, 10.1433f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(8.0084f, 2.75f, 4.75f, 6.0475f, 4.75f, 10.1433f)
                curveTo(4.75f, 12.2404f, 5.3526f, 14.5354f, 6.4337f, 16.526f)
                curveTo(7.5162f, 18.5192f, 9.046f, 20.1496f, 10.8546f, 20.995f)
                curveTo(11.5821f, 21.335f, 12.4179f, 21.335f, 13.1454f, 20.995f)
                curveTo(14.954f, 20.1496f, 16.4838f, 18.5192f, 17.5663f, 16.526f)
                curveTo(18.6474f, 14.5354f, 19.25f, 12.2404f, 19.25f, 10.1433f)
                curveTo(19.25f, 6.0475f, 15.9916f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(12.4142f, 6.75f, 12.75f, 7.0858f, 12.75f, 7.5f)
                verticalLineTo(9.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 9.25f, 15.25f, 9.5858f, 15.25f, 10.0f)
                curveTo(15.25f, 10.4142f, 14.9142f, 10.75f, 14.5f, 10.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.5f)
                curveTo(12.75f, 12.9142f, 12.4142f, 13.25f, 12.0f, 13.25f)
                curveTo(11.5858f, 13.25f, 11.25f, 12.9142f, 11.25f, 12.5f)
                verticalLineTo(10.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 10.75f, 8.75f, 10.4142f, 8.75f, 10.0f)
                curveTo(8.75f, 9.5858f, 9.0858f, 9.25f, 9.5f, 9.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.5f)
                curveTo(11.25f, 7.0858f, 11.5858f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _mapPointAdd!!
    }

private var _mapPointAdd: ImageVector? = null
