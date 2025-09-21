package dev.chiksmedina.solar.bold.buildinginfrastructure

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
import dev.chiksmedina.solar.bold.BuildingInfrastructureGroup

val BuildingInfrastructureGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(
            name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.5f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(15.7239f, 3.0f, 15.5f, 3.2239f, 15.5f, 3.5f)
                verticalLineTo(3.5589f)
                lineTo(19.0f, 6.3589f)
                verticalLineTo(3.5f)
                curveTo(19.0f, 3.2239f, 18.7762f, 3.0f, 18.5f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.75f, 9.5f)
                curveTo(10.75f, 8.8096f, 11.3097f, 8.25f, 12.0f, 8.25f)
                curveTo(12.6904f, 8.25f, 13.25f, 8.8096f, 13.25f, 9.5f)
                curveTo(13.25f, 10.1904f, 12.6904f, 10.75f, 12.0f, 10.75f)
                curveTo(11.3097f, 10.75f, 10.75f, 10.1904f, 10.75f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.75f, 10.9605f)
                lineTo(21.5315f, 11.5857f)
                curveTo(21.855f, 11.8444f, 22.3269f, 11.792f, 22.5857f, 11.4685f)
                curveTo(22.8444f, 11.1451f, 22.792f, 10.6731f, 22.4685f, 10.4143f)
                lineTo(14.3426f, 3.9136f)
                curveTo(12.9731f, 2.818f, 11.027f, 2.818f, 9.6574f, 3.9136f)
                lineTo(1.5315f, 10.4143f)
                curveTo(1.2081f, 10.6731f, 1.1556f, 11.1451f, 1.4144f, 11.4685f)
                curveTo(1.6731f, 11.792f, 2.1451f, 11.8444f, 2.4685f, 11.5857f)
                lineTo(3.25f, 10.9605f)
                verticalLineTo(21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.25f, 1.25f, 21.5858f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(20.75f)
                verticalLineTo(10.9605f)
                close()
                moveTo(9.25f, 9.5f)
                curveTo(9.25f, 7.9812f, 10.4812f, 6.75f, 12.0f, 6.75f)
                curveTo(13.5188f, 6.75f, 14.75f, 7.9812f, 14.75f, 9.5f)
                curveTo(14.75f, 11.0188f, 13.5188f, 12.25f, 12.0f, 12.25f)
                curveTo(10.4812f, 12.25f, 9.25f, 11.0188f, 9.25f, 9.5f)
                close()
                moveTo(12.0494f, 13.25f)
                curveTo(12.7143f, 13.25f, 13.2871f, 13.2499f, 13.7459f, 13.3116f)
                curveTo(14.2375f, 13.3777f, 14.7088f, 13.5268f, 15.091f, 13.909f)
                curveTo(15.4733f, 14.2913f, 15.6223f, 14.7625f, 15.6884f, 15.2542f)
                curveTo(15.7462f, 15.6842f, 15.7498f, 16.2146f, 15.75f, 16.827f)
                curveTo(15.75f, 16.8679f, 15.75f, 16.9091f, 15.75f, 16.9506f)
                lineTo(15.75f, 21.25f)
                horizontalLineTo(14.25f)
                verticalLineTo(17.0f)
                curveTo(14.25f, 16.2717f, 14.2484f, 15.8009f, 14.2018f, 15.454f)
                curveTo(14.1581f, 15.1287f, 14.0875f, 15.0268f, 14.0304f, 14.9697f)
                curveTo(13.9733f, 14.9126f, 13.8713f, 14.842f, 13.546f, 14.7982f)
                curveTo(13.1991f, 14.7516f, 12.7283f, 14.75f, 12.0f, 14.75f)
                curveTo(11.2717f, 14.75f, 10.8009f, 14.7516f, 10.4541f, 14.7982f)
                curveTo(10.1288f, 14.842f, 10.0268f, 14.9126f, 9.9697f, 14.9697f)
                curveTo(9.9126f, 15.0268f, 9.842f, 15.1287f, 9.7983f, 15.454f)
                curveTo(9.7516f, 15.8009f, 9.75f, 16.2717f, 9.75f, 17.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(8.25f)
                lineTo(8.25f, 16.9506f)
                curveTo(8.25f, 16.2858f, 8.25f, 15.7129f, 8.3116f, 15.2542f)
                curveTo(8.3777f, 14.7625f, 8.5268f, 14.2913f, 8.909f, 13.909f)
                curveTo(9.2913f, 13.5268f, 9.7626f, 13.3777f, 10.2542f, 13.3116f)
                curveTo(10.7129f, 13.2499f, 11.2858f, 13.25f, 11.9507f, 13.25f)
                horizontalLineTo(12.0494f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.75f, 9.5f)
                curveTo(10.75f, 8.8096f, 11.3097f, 8.25f, 12.0f, 8.25f)
                curveTo(12.6904f, 8.25f, 13.25f, 8.8096f, 13.25f, 9.5f)
                curveTo(13.25f, 10.1904f, 12.6904f, 10.75f, 12.0f, 10.75f)
                curveTo(11.3097f, 10.75f, 10.75f, 10.1904f, 10.75f, 9.5f)
                close()
            }
        }
            .build()
        return _home!!
    }

private var _home: ImageVector? = null
