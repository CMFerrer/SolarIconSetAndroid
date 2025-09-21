package dev.chiksmedina.solar.bold.notes

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
import dev.chiksmedina.solar.bold.NotesGroup

val NotesGroup.Documents: ImageVector
    get() {
        if (_documents != null) {
            return _documents!!
        }
        _documents = Builder(
            name = "Documents", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(1.75f, 10.0004f)
                verticalLineTo(14.0004f)
                curveTo(1.75f, 16.8288f, 1.75f, 18.243f, 2.6287f, 19.1217f)
                curveTo(2.846f, 19.339f, 3.0961f, 19.5026f, 3.3923f, 19.6257f)
                curveTo(3.3856f, 19.5812f, 3.3792f, 19.5366f, 3.3732f, 19.492f)
                curveTo(3.2499f, 18.5745f, 3.2499f, 17.4288f, 3.25f, 16.099f)
                lineTo(3.25f, 8.0003f)
                lineTo(3.25f, 7.9015f)
                verticalLineTo(7.9015f)
                curveTo(3.2499f, 6.5718f, 3.2499f, 5.4261f, 3.3732f, 4.5086f)
                curveTo(3.3792f, 4.464f, 3.3856f, 4.4194f, 3.3923f, 4.375f)
                curveTo(3.0961f, 4.4981f, 2.846f, 4.6617f, 2.6287f, 4.879f)
                curveTo(1.75f, 5.7577f, 1.75f, 7.1719f, 1.75f, 10.0004f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.75f, 10.0004f)
                verticalLineTo(14.0004f)
                curveTo(21.75f, 16.8288f, 21.75f, 18.243f, 20.8713f, 19.1217f)
                curveTo(20.654f, 19.339f, 20.4039f, 19.5026f, 20.1077f, 19.6257f)
                curveTo(20.1144f, 19.5812f, 20.1208f, 19.5366f, 20.1268f, 19.492f)
                curveTo(20.2501f, 18.5745f, 20.2501f, 17.4288f, 20.25f, 16.099f)
                verticalLineTo(7.9016f)
                curveTo(20.2501f, 6.5718f, 20.2501f, 5.4261f, 20.1268f, 4.5086f)
                curveTo(20.1208f, 4.464f, 20.1144f, 4.4194f, 20.1077f, 4.375f)
                curveTo(20.4039f, 4.4981f, 20.654f, 4.6617f, 20.8713f, 4.879f)
                curveTo(21.75f, 5.7577f, 21.75f, 7.1719f, 21.75f, 10.0004f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.6287f, 2.8787f)
                curveTo(4.75f, 3.7574f, 4.75f, 5.1716f, 4.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(4.75f, 18.8284f, 4.75f, 20.2426f, 5.6287f, 21.1213f)
                curveTo(6.5074f, 22.0f, 7.9216f, 22.0f, 10.75f, 22.0f)
                horizontalLineTo(12.75f)
                curveTo(15.5784f, 22.0f, 16.9926f, 22.0f, 17.8713f, 21.1213f)
                curveTo(18.75f, 20.2426f, 18.75f, 18.8284f, 18.75f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(18.75f, 5.1716f, 18.75f, 3.7574f, 17.8713f, 2.8787f)
                curveTo(16.9926f, 2.0f, 15.5784f, 2.0f, 12.75f, 2.0f)
                horizontalLineTo(10.75f)
                curveTo(7.9216f, 2.0f, 6.5074f, 2.0f, 5.6287f, 2.8787f)
                close()
                moveTo(8.0f, 17.0f)
                curveTo(8.0f, 16.5858f, 8.3358f, 16.25f, 8.75f, 16.25f)
                horizontalLineTo(11.75f)
                curveTo(12.1642f, 16.25f, 12.5f, 16.5858f, 12.5f, 17.0f)
                curveTo(12.5f, 17.4142f, 12.1642f, 17.75f, 11.75f, 17.75f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 17.75f, 8.0f, 17.4142f, 8.0f, 17.0f)
                close()
                moveTo(8.75f, 12.25f)
                curveTo(8.3358f, 12.25f, 8.0f, 12.5858f, 8.0f, 13.0f)
                curveTo(8.0f, 13.4142f, 8.3358f, 13.75f, 8.75f, 13.75f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 13.75f, 15.5f, 13.4142f, 15.5f, 13.0f)
                curveTo(15.5f, 12.5858f, 15.1642f, 12.25f, 14.75f, 12.25f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(8.0f, 8.5858f, 8.3358f, 8.25f, 8.75f, 8.25f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 8.25f, 15.5f, 8.5858f, 15.5f, 9.0f)
                curveTo(15.5f, 9.4142f, 15.1642f, 9.75f, 14.75f, 9.75f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 9.75f, 8.0f, 9.4142f, 8.0f, 9.0f)
                close()
            }
        }
            .build()
        return _documents!!
    }

private var _documents: ImageVector? = null
