package com.chiksmedina.solar.boldduotone.school

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
import com.chiksmedina.solar.boldduotone.SchoolGroup

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
                moveTo(7.2915f, 4.7857f)
                curveTo(4.788f, 5.5232f, 3.0369f, 7.7972f, 3.0006f, 10.4165f)
                curveTo(3.0f, 10.4575f, 3.0f, 10.5037f, 3.0f, 10.5961f)
                verticalLineTo(12.9193f)
                curveTo(3.102f, 12.9192f, 3.2056f, 12.9399f, 3.3048f, 12.9837f)
                curveTo(8.8406f, 15.4275f, 15.1597f, 15.4275f, 20.6956f, 12.9837f)
                curveTo(20.7947f, 12.9399f, 20.8982f, 12.9192f, 21.0f, 12.9193f)
                verticalLineTo(10.5961f)
                curveTo(21.0f, 10.5037f, 21.0f, 10.4575f, 20.9994f, 10.4165f)
                curveTo(20.9631f, 7.7973f, 19.212f, 5.5232f, 16.7085f, 4.7857f)
                curveTo(16.4308f, 4.6947f, 15.5892f, 4.532f, 15.2032f, 4.462f)
                curveTo(13.0832f, 4.1019f, 10.9169f, 4.1019f, 8.7969f, 4.462f)
                curveTo(8.3923f, 4.5386f, 7.5247f, 4.7105f, 7.2915f, 4.7857f)
                close()
                moveTo(10.0f, 11.926f)
                curveTo(9.5858f, 11.926f, 9.25f, 12.2595f, 9.25f, 12.671f)
                curveTo(9.25f, 13.0824f, 9.5858f, 13.4159f, 10.0f, 13.4159f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 13.4159f, 14.75f, 13.0824f, 14.75f, 12.671f)
                curveTo(14.75f, 12.2595f, 14.4142f, 11.926f, 14.0f, 11.926f)
                horizontalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.8731f, 3.9918f)
                curveTo(9.1789f, 3.1165f, 10.0165f, 2.4899f, 10.9995f, 2.4899f)
                horizontalLineTo(12.9995f)
                curveTo(13.9826f, 2.4899f, 14.8202f, 3.1165f, 15.1259f, 3.9918f)
                curveTo(15.1714f, 4.1219f, 15.1935f, 4.272f, 15.2027f, 4.4618f)
                curveTo(15.5887f, 4.5318f, 16.4303f, 4.6945f, 16.7081f, 4.7856f)
                verticalLineTo(4.7245f)
                curveTo(16.7081f, 4.386f, 16.6965f, 3.9426f, 16.5431f, 3.5034f)
                curveTo(16.0344f, 2.0471f, 14.641f, 1.0f, 12.9995f, 1.0f)
                horizontalLineTo(10.9995f)
                curveTo(9.358f, 1.0f, 7.9647f, 2.0471f, 7.456f, 3.5034f)
                curveTo(7.3026f, 3.9426f, 7.291f, 4.386f, 7.291f, 4.7245f)
                verticalLineTo(4.7855f)
                curveTo(7.5242f, 4.7104f, 8.3918f, 4.5384f, 8.7964f, 4.4618f)
                curveTo(8.8055f, 4.272f, 8.8277f, 4.1219f, 8.8731f, 3.9918f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 14.4767f)
                curveTo(20.1f, 14.8586f, 19.1814f, 15.1807f, 18.2502f, 15.443f)
                verticalLineTo(16.6438f)
                curveTo(18.2502f, 17.0552f, 17.9144f, 17.3888f, 17.5002f, 17.3888f)
                curveTo(17.086f, 17.3888f, 16.7502f, 17.0552f, 16.7502f, 16.6438f)
                verticalLineTo(15.8117f)
                curveTo(12.1726f, 16.7753f, 7.3683f, 16.3302f, 3.0f, 14.4766f)
                verticalLineTo(16.0229f)
                curveTo(3.0f, 18.1266f, 4.471f, 19.948f, 6.5385f, 20.4043f)
                curveTo(10.1356f, 21.1983f, 13.8644f, 21.1983f, 17.4615f, 20.4043f)
                curveTo(19.529f, 19.948f, 21.0f, 18.1266f, 21.0f, 16.0229f)
                verticalLineTo(14.4767f)
                close()
            }
        }
            .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
