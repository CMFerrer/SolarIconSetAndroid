package dev.chiksmedina.solar.linear.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.HomeFurnitureGroup

val HomeFurnitureGroup.Trellis: ImageVector
    get() {
        if (_trellis != null) {
            return _trellis!!
        }
        _trellis = Builder(
            name = "Trellis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 22.0f)
                verticalLineTo(21.5f)
                moveTo(5.0f, 22.0f)
                verticalLineTo(21.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 21.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.8787f, 20.1213f)
                lineTo(2.3483f, 20.6517f)
                lineTo(2.3483f, 20.6517f)
                lineTo(2.8787f, 20.1213f)
                close()
                moveTo(2.0017f, 16.0001f)
                lineTo(1.2517f, 16.0042f)
                lineTo(1.2517f, 16.0042f)
                lineTo(2.0017f, 16.0001f)
                close()
                moveTo(21.1213f, 20.1213f)
                lineTo(21.6516f, 20.6517f)
                lineTo(21.6516f, 20.6516f)
                lineTo(21.1213f, 20.1213f)
                close()
                moveTo(21.9982f, 16.0001f)
                lineTo(22.7482f, 16.0042f)
                lineTo(22.7482f, 16.0042f)
                lineTo(21.9982f, 16.0001f)
                close()
                moveTo(16.0f, 20.25f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.25f)
                close()
                moveTo(8.0f, 20.25f)
                curveTo(6.5646f, 20.25f, 5.5635f, 20.2484f, 4.8081f, 20.1469f)
                curveTo(4.0743f, 20.0482f, 3.6858f, 19.8678f, 3.409f, 19.591f)
                lineTo(2.3483f, 20.6517f)
                curveTo(2.9502f, 21.2536f, 3.7081f, 21.5125f, 4.6082f, 21.6335f)
                curveTo(5.4868f, 21.7516f, 6.607f, 21.75f, 8.0f, 21.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(1.2517f, 16.0042f)
                curveTo(1.2578f, 17.0857f, 1.2836f, 17.9871f, 1.4189f, 18.7237f)
                curveTo(1.5582f, 19.4817f, 1.8234f, 20.1267f, 2.3483f, 20.6517f)
                lineTo(3.409f, 19.591f)
                curveTo(3.1655f, 19.3475f, 2.9984f, 19.0195f, 2.8942f, 18.4527f)
                curveTo(2.7862f, 17.8644f, 2.7578f, 17.0894f, 2.7517f, 15.9959f)
                lineTo(1.2517f, 16.0042f)
                close()
                moveTo(16.0f, 21.75f)
                curveTo(17.393f, 21.75f, 18.5132f, 21.7516f, 19.3917f, 21.6335f)
                curveTo(20.2918f, 21.5125f, 21.0497f, 21.2536f, 21.6516f, 20.6517f)
                lineTo(20.591f, 19.591f)
                curveTo(20.3142f, 19.8678f, 19.9256f, 20.0482f, 19.1919f, 20.1469f)
                curveTo(18.4365f, 20.2484f, 17.4354f, 20.25f, 16.0f, 20.25f)
                verticalLineTo(21.75f)
                close()
                moveTo(21.2483f, 15.9959f)
                curveTo(21.2422f, 17.0894f, 21.2138f, 17.8644f, 21.1057f, 18.4527f)
                curveTo(21.0016f, 19.0195f, 20.8344f, 19.3475f, 20.591f, 19.591f)
                lineTo(21.6516f, 20.6516f)
                curveTo(22.1766f, 20.1267f, 22.4418f, 19.4817f, 22.581f, 18.7237f)
                curveTo(22.7163f, 17.9871f, 22.7422f, 17.0857f, 22.7482f, 16.0042f)
                lineTo(21.2483f, 15.9959f)
                close()
                moveTo(3.0f, 15.75f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.75f)
                close()
                moveTo(22.7482f, 16.0042f)
                curveTo(22.7536f, 15.0324f, 21.9644f, 14.25f, 21.0f, 14.25f)
                verticalLineTo(15.75f)
                curveTo(21.1401f, 15.75f, 21.249f, 15.8631f, 21.2483f, 15.9959f)
                lineTo(22.7482f, 16.0042f)
                close()
                moveTo(2.7517f, 15.9959f)
                curveTo(2.751f, 15.8631f, 2.8599f, 15.75f, 3.0f, 15.75f)
                verticalLineTo(14.25f)
                curveTo(2.0356f, 14.25f, 1.2463f, 15.0324f, 1.2517f, 16.0042f)
                lineTo(2.7517f, 15.9959f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5f, 15.0f)
                verticalLineTo(6.1375f)
                curveTo(20.5f, 5.7495f, 20.5f, 5.5556f, 20.4822f, 5.4229f)
                curveTo(20.359f, 4.5069f, 19.8459f, 3.9451f, 18.9449f, 3.7395f)
                curveTo(18.8144f, 3.7097f, 18.5429f, 3.6851f, 18.0f, 3.6357f)
                curveTo(16.9981f, 3.5446f, 15.8169f, 3.1959f, 14.7687f, 2.8145f)
                curveTo(13.2754f, 2.2713f, 12.5288f, 1.9996f, 12.0f, 1.9996f)
                curveTo(11.4712f, 1.9996f, 10.7246f, 2.2713f, 9.2313f, 2.8145f)
                curveTo(8.1831f, 3.1959f, 7.0019f, 3.5446f, 6.0f, 3.6357f)
                curveTo(5.4571f, 3.6851f, 5.1856f, 3.7097f, 5.0551f, 3.7395f)
                curveTo(4.1541f, 3.9451f, 3.641f, 4.5069f, 3.5178f, 5.4229f)
                curveTo(3.5f, 5.5556f, 3.5f, 5.7495f, 3.5f, 6.1375f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 18.0f)
                lineTo(17.0f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 18.0f)
                lineTo(9.0f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 11.0f)
                lineTo(13.5f, 12.0f)
                moveTo(13.5f, 8.0f)
                lineTo(10.5f, 11.0f)
                moveTo(10.5f, 7.0f)
                lineTo(9.5f, 8.0f)
            }
        }
            .build()
        return _trellis!!
    }

private var _trellis: ImageVector? = null
