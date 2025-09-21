package dev.chiksmedina.solar.bold.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ListGroup

val ListGroup.ChecklistMinimalistic: ImageVector
    get() {
        if (_checklistMinimalistic != null) {
            return _checklistMinimalistic!!
        }
        _checklistMinimalistic = Builder(
            name = "ChecklistMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(10.5431f, 7.5172f)
                curveTo(10.8288f, 7.2173f, 10.8172f, 6.7426f, 10.5172f, 6.4569f)
                curveTo(10.2173f, 6.1712f, 9.7426f, 6.1828f, 9.4569f, 6.4828f)
                lineTo(7.1429f, 8.9125f)
                lineTo(6.5431f, 8.2828f)
                curveTo(6.2574f, 7.9828f, 5.7827f, 7.9712f, 5.4828f, 8.2569f)
                curveTo(5.1828f, 8.5426f, 5.1712f, 9.0173f, 5.4569f, 9.3172f)
                lineTo(6.5998f, 10.5172f)
                curveTo(6.7413f, 10.6659f, 6.9376f, 10.75f, 7.1429f, 10.75f)
                curveTo(7.3481f, 10.75f, 7.5444f, 10.6659f, 7.686f, 10.5172f)
                lineTo(10.5431f, 7.5172f)
                close()
                moveTo(13.0f, 8.25f)
                curveTo(12.5858f, 8.25f, 12.25f, 8.5858f, 12.25f, 9.0f)
                curveTo(12.25f, 9.4142f, 12.5858f, 9.75f, 13.0f, 9.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 9.75f, 18.75f, 9.4142f, 18.75f, 9.0f)
                curveTo(18.75f, 8.5858f, 18.4142f, 8.25f, 18.0f, 8.25f)
                horizontalLineTo(13.0f)
                close()
                moveTo(10.5431f, 14.5172f)
                curveTo(10.8288f, 14.2173f, 10.8172f, 13.7426f, 10.5172f, 13.4569f)
                curveTo(10.2173f, 13.1712f, 9.7426f, 13.1828f, 9.4569f, 13.4828f)
                lineTo(7.1429f, 15.9125f)
                lineTo(6.5431f, 15.2828f)
                curveTo(6.2574f, 14.9828f, 5.7827f, 14.9712f, 5.4828f, 15.2569f)
                curveTo(5.1828f, 15.5426f, 5.1712f, 16.0173f, 5.4569f, 16.3172f)
                lineTo(6.5998f, 17.5172f)
                curveTo(6.7413f, 17.6659f, 6.9376f, 17.75f, 7.1429f, 17.75f)
                curveTo(7.3481f, 17.75f, 7.5444f, 17.6659f, 7.686f, 17.5172f)
                lineTo(10.5431f, 14.5172f)
                close()
                moveTo(13.0f, 15.25f)
                curveTo(12.5858f, 15.25f, 12.25f, 15.5858f, 12.25f, 16.0f)
                curveTo(12.25f, 16.4142f, 12.5858f, 16.75f, 13.0f, 16.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 16.75f, 18.75f, 16.4142f, 18.75f, 16.0f)
                curveTo(18.75f, 15.5858f, 18.4142f, 15.25f, 18.0f, 15.25f)
                horizontalLineTo(13.0f)
                close()
            }
        }
            .build()
        return _checklistMinimalistic!!
    }

private var _checklistMinimalistic: ImageVector? = null
