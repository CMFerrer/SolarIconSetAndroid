package dev.chiksmedina.solar.bold.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FoldersGroup

val FoldersGroup.AddFolder: ImageVector
    get() {
        if (_addFolder != null) {
            return _addFolder!!
        }
        _addFolder = Builder(
            name = "AddFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0694f, 5.0084f)
                curveTo(2.0f, 5.3759f, 2.0f, 5.8172f, 2.0f, 6.6997f)
                verticalLineTo(13.75f)
                curveTo(2.0f, 17.5212f, 2.0f, 19.4069f, 3.1716f, 20.5784f)
                curveTo(4.3432f, 21.75f, 6.2288f, 21.75f, 10.0f, 21.75f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 21.75f, 19.6569f, 21.75f, 20.8284f, 20.5784f)
                curveTo(22.0f, 19.4069f, 22.0f, 17.5212f, 22.0f, 13.75f)
                verticalLineTo(11.5479f)
                curveTo(22.0f, 8.9155f, 22.0f, 7.5993f, 21.2305f, 6.7438f)
                curveTo(21.1598f, 6.6651f, 21.0849f, 6.5902f, 21.0062f, 6.5195f)
                curveTo(20.1506f, 5.75f, 18.8345f, 5.75f, 16.2021f, 5.75f)
                horizontalLineTo(15.8284f)
                curveTo(14.6747f, 5.75f, 14.0979f, 5.75f, 13.5604f, 5.5968f)
                curveTo(13.2651f, 5.5126f, 12.9804f, 5.3947f, 12.7121f, 5.2454f)
                curveTo(12.2237f, 4.9737f, 11.8158f, 4.5658f, 11.0f, 3.75f)
                lineTo(10.4497f, 3.1997f)
                curveTo(10.1763f, 2.9263f, 10.0396f, 2.7896f, 9.8959f, 2.6705f)
                curveTo(9.2765f, 2.157f, 8.5167f, 1.8423f, 7.7156f, 1.7674f)
                curveTo(7.5298f, 1.75f, 7.3364f, 1.75f, 6.9497f, 1.75f)
                curveTo(6.0672f, 1.75f, 5.6259f, 1.75f, 5.2584f, 1.8194f)
                curveTo(3.6403f, 2.1246f, 2.3746f, 3.3903f, 2.0694f, 5.0084f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.4142f, 11.0f, 12.75f, 11.3358f, 12.75f, 11.75f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 13.0f, 14.75f, 13.3358f, 14.75f, 13.75f)
                curveTo(14.75f, 14.1642f, 14.4142f, 14.5f, 14.0f, 14.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.75f)
                curveTo(12.75f, 16.1642f, 12.4142f, 16.5f, 12.0f, 16.5f)
                curveTo(11.5858f, 16.5f, 11.25f, 16.1642f, 11.25f, 15.75f)
                verticalLineTo(14.5f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 14.5f, 9.25f, 14.1642f, 9.25f, 13.75f)
                curveTo(9.25f, 13.3358f, 9.5858f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.75f)
                curveTo(11.25f, 11.3358f, 11.5858f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
            .build()
        return _addFolder!!
    }

private var _addFolder: ImageVector? = null
