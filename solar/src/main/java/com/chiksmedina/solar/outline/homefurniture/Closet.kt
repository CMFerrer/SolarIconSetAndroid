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

val HomeFurnitureGroup.Closet: ImageVector
    get() {
        if (_closet != null) {
            return _closet!!
        }
        _closet = Builder(
            name = "Closet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 1.25f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 1.25f, 17.3498f, 1.25f, 18.489f, 1.4031f)
                curveTo(19.6614f, 1.5608f, 20.6104f, 1.8929f, 21.3588f, 2.6412f)
                curveTo(22.1071f, 3.3896f, 22.4392f, 4.3386f, 22.5969f, 5.511f)
                curveTo(22.75f, 6.6502f, 22.75f, 8.1058f, 22.75f, 9.9436f)
                verticalLineTo(13.0564f)
                curveTo(22.75f, 13.7182f, 22.75f, 14.3304f, 22.7429f, 14.8961f)
                curveTo(22.7476f, 14.9301f, 22.75f, 14.9648f, 22.75f, 15.0f)
                curveTo(22.75f, 15.0428f, 22.7464f, 15.0848f, 22.7395f, 15.1257f)
                curveTo(22.7244f, 16.0329f, 22.6873f, 16.8162f, 22.5969f, 17.489f)
                curveTo(22.4392f, 18.6614f, 22.1071f, 19.6104f, 21.3588f, 20.3588f)
                curveTo(20.8948f, 20.8227f, 20.3538f, 21.1267f, 19.7302f, 21.3282f)
                curveTo(19.7432f, 21.3834f, 19.75f, 21.4409f, 19.75f, 21.5f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(21.6263f)
                curveTo(17.1482f, 21.75f, 15.7681f, 21.75f, 14.0564f, 21.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.2319f, 21.75f, 6.8518f, 21.75f, 5.75f, 21.6263f)
                verticalLineTo(22.0f)
                curveTo(5.75f, 22.4142f, 5.4142f, 22.75f, 5.0f, 22.75f)
                curveTo(4.5858f, 22.75f, 4.25f, 22.4142f, 4.25f, 22.0f)
                verticalLineTo(21.5f)
                curveTo(4.25f, 21.4409f, 4.2568f, 21.3834f, 4.2698f, 21.3282f)
                curveTo(3.6462f, 21.1267f, 3.1052f, 20.8227f, 2.6412f, 20.3588f)
                curveTo(1.8929f, 19.6104f, 1.5608f, 18.6614f, 1.4031f, 17.489f)
                curveTo(1.3127f, 16.8162f, 1.2756f, 16.0329f, 1.2605f, 15.1257f)
                curveTo(1.2536f, 15.0848f, 1.25f, 15.0428f, 1.25f, 15.0f)
                curveTo(1.25f, 14.9648f, 1.2524f, 14.9301f, 1.2571f, 14.8961f)
                curveTo(1.25f, 14.3304f, 1.25f, 13.7182f, 1.25f, 13.0564f)
                verticalLineTo(9.9436f)
                curveTo(1.25f, 9.2818f, 1.25f, 8.6696f, 1.2571f, 8.1039f)
                curveTo(1.2524f, 8.0699f, 1.25f, 8.0352f, 1.25f, 8.0f)
                curveTo(1.25f, 7.9572f, 1.2536f, 7.9152f, 1.2605f, 7.8743f)
                curveTo(1.2756f, 6.9671f, 1.3127f, 6.1838f, 1.4031f, 5.511f)
                curveTo(1.5608f, 4.3386f, 1.8929f, 3.3896f, 2.6412f, 2.6412f)
                curveTo(3.3896f, 1.8929f, 4.3386f, 1.5608f, 5.511f, 1.4031f)
                curveTo(6.6502f, 1.25f, 8.1058f, 1.25f, 9.9436f, 1.25f)
                close()
                moveTo(2.752f, 8.75f)
                curveTo(2.7501f, 9.1384f, 2.75f, 9.5541f, 2.75f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(2.75f, 13.4459f, 2.7501f, 13.8616f, 2.752f, 14.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(2.752f)
                close()
                moveTo(11.25f, 7.25f)
                horizontalLineTo(2.7761f)
                curveTo(2.7956f, 6.6633f, 2.8299f, 6.1563f, 2.8898f, 5.7108f)
                curveTo(3.025f, 4.7048f, 3.2787f, 4.1251f, 3.7019f, 3.7019f)
                curveTo(4.1251f, 3.2787f, 4.7048f, 3.025f, 5.7108f, 2.8898f)
                curveTo(6.7385f, 2.7516f, 8.0932f, 2.75f, 10.0f, 2.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.25f)
                close()
                moveTo(12.75f, 14.25f)
                horizontalLineTo(21.248f)
                curveTo(21.2499f, 13.8616f, 21.25f, 13.4459f, 21.25f, 13.0f)
                verticalLineTo(10.0f)
                curveTo(21.25f, 8.0932f, 21.2484f, 6.7385f, 21.1102f, 5.7108f)
                curveTo(20.975f, 4.7048f, 20.7213f, 4.1251f, 20.2981f, 3.7019f)
                curveTo(19.8749f, 3.2787f, 19.2952f, 3.025f, 18.2892f, 2.8898f)
                curveTo(17.2615f, 2.7516f, 15.9068f, 2.75f, 14.0f, 2.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(14.25f)
                close()
                moveTo(21.2239f, 15.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 20.25f, 17.2615f, 20.2484f, 18.2892f, 20.1102f)
                curveTo(19.2952f, 19.975f, 19.8749f, 19.7213f, 20.2981f, 19.2981f)
                curveTo(20.7213f, 18.8749f, 20.975f, 18.2952f, 21.1102f, 17.2892f)
                curveTo(21.1701f, 16.8437f, 21.2044f, 16.3367f, 21.2239f, 15.75f)
                close()
                moveTo(11.25f, 20.25f)
                verticalLineTo(15.75f)
                horizontalLineTo(2.7761f)
                curveTo(2.7956f, 16.3367f, 2.8299f, 16.8437f, 2.8898f, 17.2892f)
                curveTo(3.025f, 18.2952f, 3.2787f, 18.8749f, 3.7019f, 19.2981f)
                curveTo(4.1251f, 19.7213f, 4.7048f, 19.975f, 5.7108f, 20.1102f)
                curveTo(6.7385f, 20.2484f, 8.0932f, 20.25f, 10.0f, 20.25f)
                horizontalLineTo(11.25f)
                close()
                moveTo(15.0f, 7.25f)
                curveTo(15.4142f, 7.25f, 15.75f, 7.5858f, 15.75f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(15.75f, 10.4142f, 15.4142f, 10.75f, 15.0f, 10.75f)
                curveTo(14.5858f, 10.75f, 14.25f, 10.4142f, 14.25f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(14.25f, 7.5858f, 14.5858f, 7.25f, 15.0f, 7.25f)
                close()
                moveTo(6.25f, 18.0f)
                curveTo(6.25f, 17.5858f, 6.5858f, 17.25f, 7.0f, 17.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 17.25f, 9.75f, 17.5858f, 9.75f, 18.0f)
                curveTo(9.75f, 18.4142f, 9.4142f, 18.75f, 9.0f, 18.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 18.75f, 6.25f, 18.4142f, 6.25f, 18.0f)
                close()
                moveTo(14.25f, 18.0f)
                curveTo(14.25f, 17.5858f, 14.5858f, 17.25f, 15.0f, 17.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 17.25f, 17.75f, 17.5858f, 17.75f, 18.0f)
                curveTo(17.75f, 18.4142f, 17.4142f, 18.75f, 17.0f, 18.75f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 18.75f, 14.25f, 18.4142f, 14.25f, 18.0f)
                close()
            }
        }
            .build()
        return _closet!!
    }

private var _closet: ImageVector? = null
