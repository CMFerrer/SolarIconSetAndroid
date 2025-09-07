package com.chiksmedina.solar.bold.school

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
import com.chiksmedina.solar.bold.SchoolGroup

val SchoolGroup.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(
            name = "Backpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.2915f, 4.7855f)
                verticalLineTo(4.7245f)
                curveTo(7.2915f, 4.386f, 7.3031f, 3.9426f, 7.4565f, 3.5034f)
                curveTo(7.9652f, 2.0471f, 9.3585f, 1.0f, 11.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveTo(14.6415f, 1.0f, 16.0349f, 2.0471f, 16.5436f, 3.5034f)
                curveTo(16.697f, 3.9426f, 16.7085f, 4.386f, 16.7085f, 4.7245f)
                verticalLineTo(4.7856f)
                curveTo(19.212f, 5.523f, 20.9631f, 7.7971f, 20.9994f, 10.4163f)
                curveTo(21.0f, 10.4574f, 21.0f, 10.5036f, 21.0f, 10.596f)
                verticalLineTo(12.9191f)
                curveTo(20.8982f, 12.9191f, 20.7947f, 12.9398f, 20.6956f, 12.9835f)
                curveTo(15.1597f, 15.4273f, 8.8406f, 15.4273f, 3.3048f, 12.9835f)
                curveTo(3.2056f, 12.9397f, 3.102f, 12.919f, 3.0f, 12.9191f)
                verticalLineTo(10.596f)
                curveTo(3.0f, 10.5036f, 3.0f, 10.4574f, 3.0006f, 10.4163f)
                curveTo(3.0369f, 7.7971f, 4.788f, 5.523f, 7.2915f, 4.7855f)
                close()
                moveTo(8.8736f, 3.9918f)
                curveTo(9.1794f, 3.1165f, 10.017f, 2.4899f, 11.0f, 2.4899f)
                horizontalLineTo(13.0f)
                curveTo(13.9831f, 2.4899f, 14.8207f, 3.1165f, 15.1264f, 3.9918f)
                curveTo(15.1719f, 4.1219f, 15.194f, 4.272f, 15.2032f, 4.4618f)
                curveTo(13.0832f, 4.1017f, 10.9169f, 4.1017f, 8.7969f, 4.4618f)
                curveTo(8.806f, 4.272f, 8.8282f, 4.1219f, 8.8736f, 3.9918f)
                close()
                moveTo(9.25f, 12.6708f)
                curveTo(9.25f, 12.2594f, 9.5858f, 11.9258f, 10.0f, 11.9258f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 11.9258f, 14.75f, 12.2594f, 14.75f, 12.6708f)
                curveTo(14.75f, 13.0822f, 14.4142f, 13.4157f, 14.0f, 13.4157f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 13.4157f, 9.25f, 13.0822f, 9.25f, 12.6708f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0f, 14.4769f)
                curveTo(20.1f, 14.8588f, 19.1814f, 15.1809f, 18.2502f, 15.4432f)
                verticalLineTo(16.644f)
                curveTo(18.2502f, 17.0554f, 17.9144f, 17.3889f, 17.5002f, 17.3889f)
                curveTo(17.086f, 17.3889f, 16.7502f, 17.0554f, 16.7502f, 16.644f)
                verticalLineTo(15.8119f)
                curveTo(12.1726f, 16.7754f, 7.3683f, 16.3304f, 3.0f, 14.4767f)
                verticalLineTo(16.0231f)
                curveTo(3.0f, 18.1267f, 4.471f, 19.9482f, 6.5385f, 20.4045f)
                curveTo(10.1356f, 21.1985f, 13.8644f, 21.1985f, 17.4615f, 20.4045f)
                curveTo(19.529f, 19.9482f, 21.0f, 18.1267f, 21.0f, 16.0231f)
                verticalLineTo(14.4769f)
                close()
            }
        }
            .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
