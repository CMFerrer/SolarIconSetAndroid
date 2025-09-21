package dev.chiksmedina.solar.outline.homefurniture

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
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) {
            return _washingMachine!!
        }
        _washingMachine = Builder(
            name = "WashingMachine", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
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
                curveTo(21.7217f, 6.4393f, 21.7448f, 7.5776f, 21.749f, 8.9616f)
                curveTo(21.7497f, 8.9743f, 21.75f, 8.9871f, 21.75f, 9.0f)
                curveTo(21.75f, 9.0114f, 21.7497f, 9.0227f, 21.7492f, 9.034f)
                curveTo(21.75f, 9.3263f, 21.75f, 9.6293f, 21.75f, 9.9436f)
                verticalLineTo(13.0564f)
                curveTo(21.75f, 14.8942f, 21.75f, 16.3498f, 21.5969f, 17.489f)
                curveTo(21.4392f, 18.6614f, 21.1071f, 19.6104f, 20.3588f, 20.3588f)
                curveTo(19.8997f, 20.8178f, 19.3652f, 21.1202f, 18.75f, 21.3218f)
                verticalLineTo(22.0f)
                curveTo(18.75f, 22.4142f, 18.4142f, 22.75f, 18.0f, 22.75f)
                curveTo(17.5858f, 22.75f, 17.25f, 22.4142f, 17.25f, 22.0f)
                verticalLineTo(21.6263f)
                curveTo(16.1482f, 21.75f, 14.7681f, 21.75f, 13.0564f, 21.75f)
                horizontalLineTo(10.9436f)
                curveTo(9.2319f, 21.75f, 7.8518f, 21.75f, 6.75f, 21.6263f)
                verticalLineTo(22.0f)
                curveTo(6.75f, 22.4142f, 6.4142f, 22.75f, 6.0f, 22.75f)
                curveTo(5.5858f, 22.75f, 5.25f, 22.4142f, 5.25f, 22.0f)
                verticalLineTo(21.3218f)
                curveTo(4.6348f, 21.1202f, 4.1003f, 20.8178f, 3.6412f, 20.3588f)
                curveTo(2.8929f, 19.6104f, 2.5608f, 18.6614f, 2.4031f, 17.489f)
                curveTo(2.25f, 16.3498f, 2.25f, 14.8942f, 2.25f, 13.0564f)
                verticalLineTo(9.9436f)
                curveTo(2.25f, 9.6293f, 2.25f, 9.3263f, 2.2508f, 9.034f)
                curveTo(2.2503f, 9.0227f, 2.25f, 9.0114f, 2.25f, 9.0f)
                curveTo(2.25f, 8.9871f, 2.2503f, 8.9743f, 2.251f, 8.9616f)
                curveTo(2.2552f, 7.5776f, 2.2783f, 6.4393f, 2.4031f, 5.511f)
                curveTo(2.5608f, 4.3386f, 2.8929f, 3.3896f, 3.6412f, 2.6412f)
                curveTo(4.3896f, 1.8929f, 5.3386f, 1.5608f, 6.511f, 1.4031f)
                curveTo(7.6502f, 1.25f, 9.1058f, 1.25f, 10.9436f, 1.25f)
                close()
                moveTo(3.75f, 9.75f)
                curveTo(3.75f, 9.8323f, 3.75f, 9.9156f, 3.75f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(3.75f, 14.9068f, 3.7516f, 16.2615f, 3.8898f, 17.2892f)
                curveTo(4.025f, 18.2952f, 4.2787f, 18.8749f, 4.7019f, 19.2981f)
                curveTo(5.1251f, 19.7213f, 5.7048f, 19.975f, 6.7108f, 20.1102f)
                curveTo(7.7385f, 20.2484f, 9.0932f, 20.25f, 11.0f, 20.25f)
                horizontalLineTo(13.0f)
                curveTo(14.9068f, 20.25f, 16.2615f, 20.2484f, 17.2892f, 20.1102f)
                curveTo(18.2952f, 19.975f, 18.8749f, 19.7213f, 19.2981f, 19.2981f)
                curveTo(19.7213f, 18.8749f, 19.975f, 18.2952f, 20.1102f, 17.2892f)
                curveTo(20.2484f, 16.2615f, 20.25f, 14.9068f, 20.25f, 13.0f)
                verticalLineTo(10.0f)
                curveTo(20.25f, 9.9156f, 20.25f, 9.8323f, 20.25f, 9.75f)
                horizontalLineTo(3.75f)
                close()
                moveTo(20.2443f, 8.25f)
                horizontalLineTo(3.7557f)
                curveTo(3.7666f, 7.2164f, 3.7982f, 6.3918f, 3.8898f, 5.7108f)
                curveTo(4.025f, 4.7048f, 4.2787f, 4.1251f, 4.7019f, 3.7019f)
                curveTo(5.1251f, 3.2787f, 5.7048f, 3.025f, 6.7108f, 2.8898f)
                curveTo(7.7385f, 2.7516f, 9.0932f, 2.75f, 11.0f, 2.75f)
                horizontalLineTo(13.0f)
                curveTo(14.9068f, 2.75f, 16.2615f, 2.7516f, 17.2892f, 2.8898f)
                curveTo(18.2952f, 3.025f, 18.8749f, 3.2787f, 19.2981f, 3.7019f)
                curveTo(19.7213f, 4.1251f, 19.975f, 4.7048f, 20.1102f, 5.7108f)
                curveTo(20.2018f, 6.3918f, 20.2334f, 7.2164f, 20.2443f, 8.25f)
                close()
                moveTo(5.75f, 5.5f)
                curveTo(5.75f, 5.0858f, 6.0858f, 4.75f, 6.5f, 4.75f)
                horizontalLineTo(9.5f)
                curveTo(9.9142f, 4.75f, 10.25f, 5.0858f, 10.25f, 5.5f)
                curveTo(10.25f, 5.9142f, 9.9142f, 6.25f, 9.5f, 6.25f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 6.25f, 5.75f, 5.9142f, 5.75f, 5.5f)
                close()
                moveTo(12.0f, 12.75f)
                curveTo(10.7574f, 12.75f, 9.75f, 13.7574f, 9.75f, 15.0f)
                curveTo(9.75f, 16.2426f, 10.7574f, 17.25f, 12.0f, 17.25f)
                curveTo(13.2426f, 17.25f, 14.25f, 16.2426f, 14.25f, 15.0f)
                curveTo(14.25f, 13.7574f, 13.2426f, 12.75f, 12.0f, 12.75f)
                close()
                moveTo(8.25f, 15.0f)
                curveTo(8.25f, 12.9289f, 9.9289f, 11.25f, 12.0f, 11.25f)
                curveTo(14.0711f, 11.25f, 15.75f, 12.9289f, 15.75f, 15.0f)
                curveTo(15.75f, 17.0711f, 14.0711f, 18.75f, 12.0f, 18.75f)
                curveTo(9.9289f, 18.75f, 8.25f, 17.0711f, 8.25f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5f, 5.5f)
                curveTo(15.5f, 6.0523f, 15.0523f, 6.5f, 14.5f, 6.5f)
                curveTo(13.9477f, 6.5f, 13.5f, 6.0523f, 13.5f, 5.5f)
                curveTo(13.5f, 4.9477f, 13.9477f, 4.5f, 14.5f, 4.5f)
                curveTo(15.0523f, 4.5f, 15.5f, 4.9477f, 15.5f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.5f, 5.5f)
                curveTo(18.5f, 6.0523f, 18.0523f, 6.5f, 17.5f, 6.5f)
                curveTo(16.9477f, 6.5f, 16.5f, 6.0523f, 16.5f, 5.5f)
                curveTo(16.5f, 4.9477f, 16.9477f, 4.5f, 17.5f, 4.5f)
                curveTo(18.0523f, 4.5f, 18.5f, 4.9477f, 18.5f, 5.5f)
                close()
            }
        }
            .build()
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
