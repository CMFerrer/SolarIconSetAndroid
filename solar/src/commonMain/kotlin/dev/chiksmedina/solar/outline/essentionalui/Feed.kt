package dev.chiksmedina.solar.outline.essentionalui

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
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Feed: ImageVector
    get() {
        if (_feed != null) {
            return _feed!!
        }
        _feed = Builder(
            name = "Feed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9506f, 8.25f)
                horizontalLineTo(15.0494f)
                curveTo(15.7142f, 8.25f, 16.2871f, 8.2499f, 16.7458f, 8.3116f)
                curveTo(17.2375f, 8.3777f, 17.7087f, 8.5268f, 18.091f, 8.909f)
                curveTo(18.4732f, 9.2913f, 18.6223f, 9.7625f, 18.6884f, 10.2542f)
                curveTo(18.7501f, 10.7129f, 18.75f, 11.2857f, 18.75f, 11.9506f)
                verticalLineTo(16.0494f)
                curveTo(18.75f, 16.7142f, 18.7501f, 17.2871f, 18.6884f, 17.7458f)
                curveTo(18.6223f, 18.2375f, 18.4732f, 18.7087f, 18.091f, 19.091f)
                curveTo(17.7087f, 19.4732f, 17.2375f, 19.6223f, 16.7458f, 19.6884f)
                curveTo(16.2871f, 19.7501f, 15.7143f, 19.75f, 15.0495f, 19.75f)
                horizontalLineTo(8.9506f)
                curveTo(8.2858f, 19.75f, 7.7129f, 19.7501f, 7.2542f, 19.6884f)
                curveTo(6.7625f, 19.6223f, 6.2913f, 19.4732f, 5.909f, 19.091f)
                curveTo(5.5268f, 18.7087f, 5.3777f, 18.2375f, 5.3116f, 17.7458f)
                curveTo(5.2499f, 17.2871f, 5.25f, 16.7142f, 5.25f, 16.0494f)
                verticalLineTo(11.9506f)
                curveTo(5.25f, 11.2858f, 5.2499f, 10.7129f, 5.3116f, 10.2542f)
                curveTo(5.3777f, 9.7625f, 5.5268f, 9.2913f, 5.909f, 8.909f)
                curveTo(6.2913f, 8.5268f, 6.7625f, 8.3777f, 7.2542f, 8.3116f)
                curveTo(7.7129f, 8.2499f, 8.2858f, 8.25f, 8.9506f, 8.25f)
                close()
                moveTo(7.454f, 9.7982f)
                curveTo(7.1287f, 9.842f, 7.0268f, 9.9126f, 6.9697f, 9.9697f)
                curveTo(6.9126f, 10.0268f, 6.842f, 10.1287f, 6.7982f, 10.454f)
                curveTo(6.7516f, 10.8009f, 6.75f, 11.2717f, 6.75f, 12.0f)
                verticalLineTo(16.0f)
                curveTo(6.75f, 16.7283f, 6.7516f, 17.1991f, 6.7982f, 17.546f)
                curveTo(6.842f, 17.8713f, 6.9126f, 17.9732f, 6.9697f, 18.0303f)
                curveTo(7.0268f, 18.0874f, 7.1287f, 18.158f, 7.454f, 18.2018f)
                curveTo(7.8009f, 18.2484f, 8.2717f, 18.25f, 9.0f, 18.25f)
                horizontalLineTo(15.0f)
                curveTo(15.7283f, 18.25f, 16.1991f, 18.2484f, 16.546f, 18.2018f)
                curveTo(16.8713f, 18.158f, 16.9732f, 18.0874f, 17.0303f, 18.0303f)
                curveTo(17.0874f, 17.9732f, 17.158f, 17.8713f, 17.2018f, 17.546f)
                curveTo(17.2484f, 17.1991f, 17.25f, 16.7283f, 17.25f, 16.0f)
                verticalLineTo(12.0f)
                curveTo(17.25f, 11.2717f, 17.2484f, 10.8009f, 17.2018f, 10.454f)
                curveTo(17.158f, 10.1287f, 17.0874f, 10.0268f, 17.0303f, 9.9697f)
                curveTo(16.9732f, 9.9126f, 16.8713f, 9.842f, 16.546f, 9.7982f)
                curveTo(16.1991f, 9.7516f, 15.7283f, 9.75f, 15.0f, 9.75f)
                horizontalLineTo(9.0f)
                curveTo(8.2717f, 9.75f, 7.8009f, 9.7516f, 7.454f, 9.7982f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 5.25f)
                curveTo(6.5858f, 5.25f, 6.25f, 5.5858f, 6.25f, 6.0f)
                curveTo(6.25f, 6.4142f, 6.5858f, 6.75f, 7.0f, 6.75f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 6.75f, 12.75f, 6.4142f, 12.75f, 6.0f)
                curveTo(12.75f, 5.5858f, 12.4142f, 5.25f, 12.0f, 5.25f)
                horizontalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.9436f, 1.25f)
                horizontalLineTo(13.0564f)
                curveTo(14.8942f, 1.25f, 16.3498f, 1.25f, 17.489f, 1.4031f)
                curveTo(18.6614f, 1.5608f, 19.6104f, 1.8929f, 20.3588f, 2.6412f)
                curveTo(21.1071f, 3.3896f, 21.4392f, 4.3386f, 21.5969f, 5.511f)
                curveTo(21.75f, 6.6502f, 21.75f, 8.1058f, 21.75f, 9.9435f)
                verticalLineTo(14.0564f)
                curveTo(21.75f, 15.8942f, 21.75f, 17.3498f, 21.5969f, 18.489f)
                curveTo(21.4392f, 19.6614f, 21.1071f, 20.6104f, 20.3588f, 21.3588f)
                curveTo(19.6104f, 22.1071f, 18.6614f, 22.4392f, 17.489f, 22.5969f)
                curveTo(16.3498f, 22.75f, 14.8942f, 22.75f, 13.0565f, 22.75f)
                horizontalLineTo(10.9436f)
                curveTo(9.1059f, 22.75f, 7.6502f, 22.75f, 6.511f, 22.5969f)
                curveTo(5.3386f, 22.4392f, 4.3896f, 22.1071f, 3.6412f, 21.3588f)
                curveTo(2.8929f, 20.6104f, 2.5608f, 19.6614f, 2.4031f, 18.489f)
                curveTo(2.25f, 17.3498f, 2.25f, 15.8942f, 2.25f, 14.0564f)
                verticalLineTo(9.9436f)
                curveTo(2.25f, 8.1058f, 2.25f, 6.6502f, 2.4031f, 5.511f)
                curveTo(2.5608f, 4.3386f, 2.8929f, 3.3896f, 3.6412f, 2.6412f)
                curveTo(4.3896f, 1.8929f, 5.3386f, 1.5608f, 6.511f, 1.4031f)
                curveTo(7.6502f, 1.25f, 9.1058f, 1.25f, 10.9436f, 1.25f)
                close()
                moveTo(6.7108f, 2.8898f)
                curveTo(5.7048f, 3.025f, 5.1251f, 3.2787f, 4.7019f, 3.7019f)
                curveTo(4.2787f, 4.1251f, 4.025f, 4.7048f, 3.8898f, 5.7108f)
                curveTo(3.7516f, 6.7385f, 3.75f, 8.0932f, 3.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.75f, 15.9068f, 3.7516f, 17.2615f, 3.8898f, 18.2892f)
                curveTo(4.025f, 19.2952f, 4.2787f, 19.8749f, 4.7019f, 20.2981f)
                curveTo(5.1251f, 20.7213f, 5.7048f, 20.975f, 6.7108f, 21.1102f)
                curveTo(7.7385f, 21.2484f, 9.0932f, 21.25f, 11.0f, 21.25f)
                horizontalLineTo(13.0f)
                curveTo(14.9068f, 21.25f, 16.2615f, 21.2484f, 17.2892f, 21.1102f)
                curveTo(18.2952f, 20.975f, 18.8749f, 20.7213f, 19.2981f, 20.2981f)
                curveTo(19.7213f, 19.8749f, 19.975f, 19.2952f, 20.1102f, 18.2892f)
                curveTo(20.2484f, 17.2615f, 20.25f, 15.9068f, 20.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(20.25f, 8.0932f, 20.2484f, 6.7385f, 20.1102f, 5.7108f)
                curveTo(19.975f, 4.7048f, 19.7213f, 4.1251f, 19.2981f, 3.7019f)
                curveTo(18.8749f, 3.2787f, 18.2952f, 3.025f, 17.2892f, 2.8898f)
                curveTo(16.2615f, 2.7516f, 14.9068f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(9.0932f, 2.75f, 7.7385f, 2.7516f, 6.7108f, 2.8898f)
                close()
            }
        }
            .build()
        return _feed!!
    }

private var _feed: ImageVector? = null
